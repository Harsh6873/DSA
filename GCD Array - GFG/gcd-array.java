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
            
            
            int K;
            K = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, N);
            
            Solution obj = new Solution();
            int res = obj.solve(N, K, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int solve(int N, int K, int[] arr) {
        // code here
        int ct = 0;
        for(int i=0;i<N;i++){
            ct += arr[i];
        }
        ArrayList<Integer> tee = new ArrayList<>();
        for(int i=1;i*i <= ct;i++){
            if(ct%i == 0){
                tee.add(ct/i);
                if(i*i != ct){
                    tee.add(i);
                }
            }
        }
        Collections.sort(tee,Collections.reverseOrder());
        int c;
        int ans= 1;
        int st=0;
        for(int i=0;i<tee.size();i++){
            int h = tee.get(i);
            c =0;
            st =0;
            for(int j=0;j<N;j++){
                st += arr[j];
                if(st%h == 0){
                    c++;
                    st=0;
                }
            }
            if(c >= K){
                return tee.get(i);
            }
        }
        return ans;
    }
}
        
