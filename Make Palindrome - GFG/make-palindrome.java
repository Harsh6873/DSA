//{ Driver Code Starts
import java.io.*;
import java.util.*;


class StringArray
{
    public static String[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        return s;
    }

    public static void print(String[] a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<String> a)
    {
        for(String e : a)
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
            
            
            String[] arr = StringArray.input(br, n);
            
            Solution obj = new Solution();
            boolean res = obj.makePalindrome(n, arr);
            
            String _result_val = (res) ? "YES" : "NO";
            System.out.println(_result_val);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static boolean makePalindrome(int n, String[] arr) {
        // code here
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder(arr[i]);
            sb.reverse();
            if(map.containsKey(sb.toString())) map.remove(sb.toString());
            else map.put(arr[i], 1);
        }
        if(map.size() > 1) return false;
        else if(map.size() == 1){
            StringBuilder sb = new StringBuilder("");
            String s = "";
            for(Map.Entry<String, Integer> entry: map.entrySet()){
                s = entry.getKey();
                sb.append(s);
            }
            if(sb.reverse().toString().equals(s)) return true;
            return false;
           
        }else return true;
    }
}
        
