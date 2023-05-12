//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.arrayOperations(n, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int arrayOperations(int n, int[] arr) {
        // code here
        int i=0;
        boolean x = false;
        for( ; i<n ; i++){
            if(arr[i] == 0){
                x = true;
                break;
            }
        }
        if(i==n && x==false){
            return -1;
        }
        
        //when arr contains 0 only
        int j=0;
        for( ; j<n ; j++){
            if(arr[j]==0){
                continue;
            }
            break;
        }
        if(j==n)
            return 0;
        int count=0;
        Stack<Integer> st = new Stack<>();
        for(j=0 ;j<n ; j++){
            if(arr[j]==0){
                if(st.isEmpty()){
                    continue;
                }
                else{
                   st.clear();
                   count++;
                }
            }
            else{
                st.push(arr[j]);
            }
        }
        
        if(st.isEmpty()){
            return count;
        }
        
        return count+1;
    }
}
        
