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
            String[] S = br.readLine().trim().split(" ");
            int m = Integer.parseInt(S[0]);
            int n = Integer.parseInt(S[1]);
            int[][] G = new int[m][n];
            for(int i = 0; i < m; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    G[i][j] = Integer.parseInt(s[j]);
            }
            Solution obj = new Solution();
            int ans = obj.maximumMatch(G);
            out.println(ans);
       }
       out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int maximumMatch(int[][] G)
    {
        int a = G.length;
        int b = G[0].length;
        int[] dp = new int[b];
        int res = 0;
        Arrays.fill(dp, -1);

        for (int u = 0; u < a; u++) {
          boolean[] vis = new boolean[b];
          if (bfs(u, G, dp, vis)) res++;
        }
        return res;
    }

    private static boolean bfs(int u, int[][] g, int[] dp, boolean[] vis) {
        for (int v = 0; v < g[0].length; v++) {
            if (g[u][v] == 1 && !vis[v]) {
                vis[v] = true;
                if (dp[v] == -1 || bfs(dp[v], g, dp, vis)) {
                  dp[v] = u;
                  return true;
                }
            }
        }
        return false;
    }
}