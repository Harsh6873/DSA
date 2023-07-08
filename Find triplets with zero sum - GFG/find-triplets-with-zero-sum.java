//{ Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/

class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        if(n < 2){
            return false;
        }
        if(n==3){
            return arr[0]+arr[1]+arr[2] == 0?true:false;
        }
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int l=0;
            int lf=i+1;
            int ri = n-1;
            while(lf < ri){
                l = arr[i]+arr[lf]+arr[ri];
                if(l == 0){
                    return true;
                }
                else if(l > 0){
                    ri--;
                }
                else{
                    lf++;
                }
            }
            
        }return false;
        
    }
}