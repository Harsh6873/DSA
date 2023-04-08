//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {

        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int[] arr = IntArray.input(br, n);

            Solution obj = new Solution();
            ArrayList<Integer> res = obj.makeBeautiful(arr);
            for (int e : res) out.print(e + " ");
            out.println();
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here
         ArrayList<Integer> d = new ArrayList<>();  
       Stack<Integer> stack = new Stack<Integer>();
       
       for(int i=0;i<arr.length;i++)
       {
           if(stack.isEmpty())
           stack.push(arr[i]);
          else if(arr[i]>=0&&stack.peek()>=0)
           stack.push(arr[i]);
          else if(arr[i]<0&&stack.peek()<0)
           stack.push(arr[i]);
           else
           stack.pop();
           
       }
       while(stack.empty()==false)
       {
              d.add(stack.peek());
              stack.pop();
       }
        Collections.reverse(d);

    return d;
    }
}
