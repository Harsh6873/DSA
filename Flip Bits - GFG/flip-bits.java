//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.maxOnes(a, n));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution {

    public static int maxOnes(int arr[], int n) {
        // Your code goes here
        int max=0;
        int c = 0;
        int maxc = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                maxc++; 
            }
            if(arr[i]==0){ 
                c++; 
            }else{
                c--; 
            }
            if(c>0 && c > max){
                max = c;
            }else if(c<0){
                c = 0;
            }
        }
        return max + maxc;
    }
}
