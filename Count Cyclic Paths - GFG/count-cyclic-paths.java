//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
	public static int countPaths(int N){
		//code here
		int n = 1000000007;
        long res = 0;
        for(int i=2;i<=N;i++){
            if(i%2==0){
                res=(res%n*3%n)%n+3;
            }else{
                res=(res%n*3%n)%n-3;
            }
        }
        return (int)res%n;
	}
}

//{ Driver Code Starts.

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.countPaths(N));
        }
    }
}

// } Driver Code Ends