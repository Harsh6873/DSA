//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        HashMap<Integer, Integer> hs = new HashMap<>();
        ArrayList<Integer> ls = new ArrayList<>();

        for(int num : arr)
        {
            hs.put(num, hs.getOrDefault(num,0) + 1);
        }
        
        for(int key : hs.keySet()){
            if(hs.get(key)>1){
                ls.add(key);
            }
        }
        Collections.sort(ls);
        if(ls.isEmpty()){
            ls.add(-1);
        }
        
        return ls;
        
    }
}
