//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int A =sc.nextInt();
            int B =sc.nextInt();
            int C =sc.nextInt();
            int D =sc.nextInt();
             
           System.out.println(new Solution().carpetBox(A,B,C,D)); 
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    int carpetBox(int A, int B, int C, int D) { 
        //code here
     
        if((A <= C && B <= D) || (A <= D && B <= C)){
            return 0;
        }
        if(A > C && A > D){
            return 1+carpetBox(A/2,B,C,D);
        }
        if(B >D && B >C){
            return 1+carpetBox(A,B/2,C,D);
            }
        return Math.min(1+carpetBox(A/2,B,C,D),1+carpetBox(A,B/2,C,D));
        
    }
   
}
