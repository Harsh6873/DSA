//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String srgs[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s1[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(s1[0]);
            int m = Integer.parseInt(s1[1]);
            String s = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPossible(n, m, s));
        }
    }
}
// } Driver Code Ends


// User function Template for 

class Solution{
    static int isPossible(int n, int m, String s){
        // code here
         int curRow=0, curCol=0, minRow=0, maxRow=0, minCol=0, maxCol=0;

        for(char ch:s.toCharArray())

        {

            if(ch=='L')curCol--;

            if(ch=='R')curCol++;

            if(ch=='U')curRow--;

            if(ch=='D')curRow++;

            minRow=Math.min(minRow, curRow);

            maxRow=Math.max(maxRow, curRow);

            minCol=Math.min(minCol, curCol);

            maxCol=Math.max(maxCol, curCol);

        }

        return maxRow-minRow<n && maxCol-minCol<m?1:0;
    }
}