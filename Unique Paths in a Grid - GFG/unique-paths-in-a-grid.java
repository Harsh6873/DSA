//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(S[0]);
            int m = Integer.parseInt(S[1]);
            
            int [][] grid = new int[n][m];
            for(int i=0; i<n; i++)
            {
                String S1[] = read.readLine().split(" ");
                for(int j=0; j<m; j++)
                {
                    grid[i][j] = Integer.parseInt(S1[j]);
                }
            }

            Solution ob = new Solution();
            System.out.println(ob.uniquePaths(n,m,grid));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static int max = 1000000007; 
    static int fun(int[][] dp,int [][] arr,int n, int m, int i, int j){
        if(i==n-1 && j==m-1)
            return 1;
        if(i>=n || j>=m || i<0 || j<0)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        long a = 0 , b = 0;
        if(i+1<n && arr[i+1][j]==1)
            a = (long)fun(dp,arr,n,m,i+1,j);
        if(j+1<m && arr[i][j+1]==1)
            b = (long)fun(dp,arr,n,m,i,j+1);
        return dp[i][j] = ((int)a+(int)b)%max;
    }
    static int uniquePaths(int n, int m, int[][] grid) {
        int[][] dp = new int[n+1][m+1];
        for ( int i=0; i<=n; i++){
            for ( int j=0; j<=m; j++)
                dp[i][j] = -1;
        }
        if(grid[0][0]==0)
            return 0;
        return fun(dp,grid,n,m,0,0);
    }
};