//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }

        Long nextLong(){
            return Long.parseLong(next());
        }
    } 

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();        
        PrintWriter out = new PrintWriter(System.out);
        int testcases = sc.nextInt();

        while (testcases-- > 0) {
            String S = sc.next();
            Solution ob = new Solution();
            long ans = ob.countSubstring(S);
            out.println(ans);
        }
        out.flush();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    long countSubstring(String S){
        int a = S.length();
        long result = 0, b = 0;
        int z= a;
        int dp[] = new int[2 * a + 5];
        int cur=z;
        for(int i = 0; i < a; i++){
            if(S.charAt(i) == '0')
                cur--;
            else
                cur++;
            if(cur <= z){
                b++;
            }
            dp[cur]++;
        }
        for(int i = 0; i < a; i++){
            result += (a - i - b) * 1l;
            if(S.charAt(i) == '1'){
                dp[z+1]--;
                z++;
                b += dp[z];
            }
            else{
                dp[z-1]--;
                z--;
                b--;
                b -= dp[z+1];
            }
        }
        return result;
    
       
    }
}