//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            int N = Integer.parseInt(read.readLine().trim());
            String input_line[] = read.readLine().trim().split("\\s+");
            int A[]= new int[N];
            for(int i = 0; i < N; i++)
                A[i] = Integer.parseInt(input_line[i]);
            input_line = read.readLine().trim().split("\\s+");
            int B[]= new int[N];
            for(int i = 0; i < N; i++)
                B[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            long ans = ob.maxPossibleValue(N, A, B); 
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    long maxPossibleValue(int N, int A[] ,int B[]) { 
        // code here
        
        long ans=0;
        int res =0;
        int mn = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            int l = A[i];
            int u = B[i];
            if(u%2 != 0){
                u--;
            }
            if(u>=2){
                mn = Math.min(mn,l);
            }
            ans+= (l*u);
            res = res+u;
        }
        if(res%4 != 0){
            ans -= (2*mn);
        }
        return ans;
    }
} 