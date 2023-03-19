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
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.getDistinctDifference(N, A);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {
        // code here
        ArrayList<Integer>res= new ArrayList<Integer>();
        
        if(N==1){
            res.add(0);
            return res;
        }
        
        Map <Integer, Integer>r = new HashMap<>();
        Map <Integer, Integer>l = new HashMap<>();
        
        for(int i: A){
            r.put(i,r.getOrDefault(i,0)+1);
        }
        
        for(int i:A){
            r.put(i,r.get(i)-1);
            if(r.get(i)<=0){
                r.remove(i);
            }
            res.add(l.size()-r.size());
            l.put(i,r.getOrDefault(i,0)+1);
        }
        
        return res;
    }
}
        
