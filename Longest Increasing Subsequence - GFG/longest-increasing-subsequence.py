#User function Template for python3

from bisect import bisect_left
class Solution:
    
    #Function to find length of longest increasing subsequence.
    def longestSubsequence(self,a,n):
        # code here
        arr = []
        m = 1  #length of subsequence
        
        arr.append(a[0])
        
        for i in range(n):
            if(a[i] > arr[len(arr)-1]):
                arr.append(a[i])
                m += 1
            else:
                l = bisect_left(arr,a[i])
                arr[l] = a[i]
        return(m)
       


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    for _ in range(int(input())):
        n = int(input())
        a = [ int(x) for x in input().split() ]
        ob=Solution()
        print(ob.longestSubsequence(a,n))
# } Driver Code Ends