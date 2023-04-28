//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Gfg {
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            
            String s[]=in.readLine().trim().split(" ");
            int n=Integer.parseInt(s[0]);
            int m=Integer.parseInt(s[1]);
            char c[][]=new char[n][m];
            for(int i=0;i<n;i++){
                s=in.readLine().trim().split(" ");
                for(int j=0;j<m;j++){
                    c[i][j]=s[j].charAt(0);
                }
            }
            Solution ob=new Solution();
            int ans[][]=ob.chefAndWells(n, m, c);

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    out.print(ans[i][j]+" ");
                }
                out.println();
            }
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    Queue<int[]> queue;
    public int[][] chefAndWells(int n,int m,char c[][])
    {
        int [][]arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(c[i][j]=='H' || c[i][j]=='.') arr[i][j]=-1;
                else if(c[i][j]=='W') arr[i][j]=0;
                else arr[i][j]=Integer.MAX_VALUE;
            }
        }
        queue=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0) queue.offer(new int[]{i,j});
            }
        }
        
        while(!queue.isEmpty()){
            int count=queue.size();
            for(int i=0;i<count;i++) updateQueue(queue.poll(),arr);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(c[i][j]=='N' || c[i][j]=='.') arr[i][j]=0;
            }
        }
        
        return arr;
    }
    
    void updateQueue(int []water,int [][]arr){
        int distance=arr[water[0]][water[1]]+2;
        int []dx={0,1,-1,0};
        int []dy={-1,0,0,1};
        for(int i=0;i<4;i++){
            int x=water[0]+dx[i],y=water[1]+dy[i];
            if(!inValid(x,y,arr)){
                arr[x][y]=distance;
                queue.offer(new int[]{x,y});
            }
        }
    }
    
    boolean inValid(int i,int j,int arr[][]){
        return (i<0 || i==arr.length || j<0 || j==arr[0].length || arr[i][j]!=-1);
    }
}