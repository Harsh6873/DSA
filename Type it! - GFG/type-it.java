//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String s = read.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.minOperation(s);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int minOperation(String s) {
        int ss = s.length()/2-1;
        int t = 2*ss+1;
        int l = 0;
        while(ss>=0){
            if(s.charAt(ss)!=s.charAt(t)){
                ss--;
                t-= 2;
            }
            else{
                int t1=ss;
                int t2=t;
                while(ss>=0 && s.charAt(ss)==s.charAt(t)){
                    ss--;t--;
                }
                if(ss<0){
                    l = t+1;
                    break;
                }
                else{
                    ss=t1-1;
                    t=t2-2;
                }
            }
        }
        return Math.min(s.length(),s.length()-l+1);
    }
}