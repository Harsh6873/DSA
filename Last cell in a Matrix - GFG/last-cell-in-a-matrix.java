//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            Solution obj = new Solution();
            int[] p = obj.endPoints(matrix,r,c);
            out.print("(" +  p[0]+ ", " +  p[1]+ ")" +"\n");
        }
        out.close();
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    static int [] endPoints(int [][]matrix, int R, int C){
        //code here
        int z=0, x=0;
        while(true){
            while(x<C && matrix[z][x]==0) x++;
            if(x==C) return new int[]{z, x-1};
            else matrix[z][x]=0;
            while(z<R && matrix[z][x]==0) z++;
            if(z==R) return new int[]{z-1, x};
            else matrix[z][x]=0;
            while(x>=0 && matrix[z][x]==0) x--;
            if(x==-1) return new int[]{z, x+1};
            else matrix[z][x]=0;
            while(z>=0 && matrix[z][x]==0) z--;
            if(z==-1) return new int[]{z+1, x};
            else matrix[z][x]=0;
        }
 
    }
}