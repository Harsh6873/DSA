//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            Solution obj = new Solution();
            int res = obj.findCatalan(n);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int findCatalan(int n) {
        // code here
        int a=(int)1e9+7;
        if(n<=1){
             return 1;
         }
      
         
        int []dp=new int[n+2];
        dp[0]=1;
        dp[1]=1;
        
        for(int i=2;i<=n;i++){
            // dp[i]=0;
             for(int j=0;j<i;j++){
                   dp[i]=  (dp[i] + (int)((long)dp[j] * dp[i - j - 1] % a)) % a;
             }
        }
        
        return dp[n];
       
    }
}
        
