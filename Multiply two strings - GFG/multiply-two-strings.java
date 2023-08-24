//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.math.*;

class Multiply{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            Solution g=new Solution();
            System.out.println(g.multiplyStrings(a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        //code here.
        if(s1 == "0" || s2 == "0"){
            return "0";
        }
        int l1 = s1.length();
        int l2 = s2.length();
        boolean f=false;
        boolean f1 = false;
        int lh1 = 0;
        if(s1.charAt(0) == '-'){
            lh1=1;
            f=true;
            l1 -= 1;
        }
        int lh2=0;
        if(s2.charAt(0) == '-'){
            lh2 = 1;
            f1 = true;
            l2 -= 1;
        }
        int arr[] = new int[l1+l2];
        int i=s2.length()-1;
        int pf=0;
        while(i >= lh2){
            int v = s2.charAt(i)-'0';
            int c=0;
            int k = arr.length-1-pf;
            int j = s1.length()-1;
            while(j >= lh1 || c != 0){
                int vv = j>=lh1?s1.charAt(j)-'0':0;
                int p = v*vv + c+arr[k];
                arr[k] = p%10;
                c = p/10;
                j--;
                k--;
            }
            i--;
            pf++;
        }
        String str = "";
        if(f||f1){
            str += '-';
        }
        if(f && f1){
            str = "";
        }
        boolean t = false;
        for(int l=0;l<arr.length;l++){
            if(arr[l] != 0){
                t= true;
            }
            if(t){
                str += arr[l];
            }
        }
        return str;
    }
}