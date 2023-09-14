//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Solution ob = new Solution();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    
// } Driver Code Ends


class Solution{

	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    // Your code goes here
	    int[][] arr1 = new int[n + 1][sum + 1];
        arr1[0][0] = 1;
        int m = (int) 1e9 + 7;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                int a = arr1[i - 1][j];
                if (j - arr[i - 1] >= 0)
                    a += arr1[i - 1][j - arr[i - 1]];
                arr1[i][j] = a % m;
            }
        }

        return arr1[n][sum];
	} 
}