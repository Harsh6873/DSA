//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A = read.readLine();
            String B = read.readLine();

            Solution ob = new Solution();
            out.println(ob.minRepeats(A,B));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int minRepeats(String A, String B) {
        int t1 = B.length()/A.length();
        if(B.length()%A.length() != 0){
            t1+= 1;
        }
        int t2 = t1 +1;
        String str = "";
        for (int i = 0; i < t1; i++) {
            str += A;
        }

        String str1 = "";
        for (int i = 0; i < t2; i++) {
            str1 += A;
        }

        if(str.contains(B)){
            return t1;
        } else if(str1.contains(B)){
            return t2;
        }else{
            return -1;
        }
    }
};