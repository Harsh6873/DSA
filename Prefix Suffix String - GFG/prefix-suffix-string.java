//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;

public class code1 
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            String s1[]=in.readLine().trim().split(" ");
            String s2[]=in.readLine().trim().split(" ");

            Solution ob=new Solution();
            int ans=ob.prefixSuffixString(s1,s2);
            out.println(ans);

        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int prefixSuffixString(String s1[],String s2[])
    {
        int count=0;
        for(int i=0;i<s2.length;i++){
            for(int j=0;j<s1.length;j++){
                String str=s2[i];  //second list string
                int len=str.length();  //length of string
                if(s1[j].length()>=len&&str.equals(s1[j].substring(0,len))){
                    count++;
                    break;
                }
                else if(s1[j].length()>=len&&str.equals(s1[j].substring(s1[j].length()-len,s1[j].length()))){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}