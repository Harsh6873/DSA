//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.maxInstance(s);
            out.println(ans);
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int maxInstance(String s) {
        // Code here
        int[]table = new int [26];
        for(int ch : s.toCharArray()){
            table[ch - 'a']++;
        }
        String balloon = "balloon";
        int ans = Integer.MAX_VALUE;
        for(int ch : balloon.toCharArray()){
            if(ch == 'l' || ch == 'o'){
                ans = Math.min(ans,  table[ch - 'a']/2);
            }else{
                ans = Math.min(ans,  table[ch - 'a']);
            }
            
        }
        return ans;
    }
}