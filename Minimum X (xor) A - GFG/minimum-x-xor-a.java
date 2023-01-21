//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int a = Integer.parseInt(br.readLine().trim());
            int b = Integer.parseInt(br.readLine().trim());

            Solution ob = new Solution();
            out.println(ob.minVal(a, b));
        }
        out.flush();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int minVal(int a, int b) {
        int y = count_S(b);
        int re=0;
        for(int i=30;i>=0;i--){
            int ma = (1 << i);
            if((ma & a) > 0 && y > 0){
                re = re | ma;
                y--;
            }
        }
        int i=0;
        while(y > 0){
            int mas = (1 << i);
            if((mas & re) == 0){
                re = re | mas;
                y--;
            }
            i++;
        }
        return re;
    }
    static int count_S(int d){
        int re =0;
        while(d > 0){
            d = (d&(d-1));
            re++;
        }
        return re;
    }
}