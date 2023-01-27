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
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.CountWays(str);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    static int m=1000000007;
    public int CountWays(String s){
        // code here
        long x=1, y=0;
        int n=s.length();
        for(int i=n-1;i>=0;i--) {
            long z=s.charAt(i)=='0'?0:x;
            if(i<n-1&&(s.charAt(i)=='1'||s.charAt(i)=='2'&&s.charAt(i+1)<'7'))
                z=(z+y)%m;
            y=x;
            x=z;
        }
        return (int)(x%m);
    }
}

       
    
