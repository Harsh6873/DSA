//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            int ans = ob.Count(matrix);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int  Count(int[][] matrix)
    {
        // code here
        int c=0,ans=0;
        
        int r1= matrix.length;
        int c1=matrix[0].length;
        if(r1 == 1){
            return 0;
        }
        
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                c=0;
            
                if(matrix[i][j]==0) continue;
                
                if(i>0 && matrix[i-1][j]==0) c++;
                if(j>0 && matrix[i][j-1]==0) c++;
                if(i<r1-1 && matrix[i+1][j]==0) c++;
                if(j<c1-1 && matrix[i][j+1]==0) c++;
                if(i>0 && j>0 && matrix[i-1][j-1]==0) c++;
                if(i<r1-1 && j<c1-1 && matrix[i+1][j+1]==0) c++;
                if(i>0 && j<c1-1 && matrix[i-1][j+1]==0) c++;
                if(j>0 && i<r1-1 && matrix[i+1][j-1]==0) c++;
                
                if(c!=0 && c%2==0) ans+= 1;
            }
        }
        
        return ans;
    }
}