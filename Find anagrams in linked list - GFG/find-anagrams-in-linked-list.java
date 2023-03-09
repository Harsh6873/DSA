//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class Node {
    char data;
    Node next;

    Node(char x) {
        data = x;
        next = null;
    }

    public static Node inputList(BufferedReader br) throws IOException {
        int n = Integer.parseInt(br.readLine().trim()); // Length of Linked List

        String[] s = br.readLine().trim().split(" ");
        Node head = new Node((s[0].charAt(0))), tail = head;
        for (int i = 1; i < s.length; i++)
            tail = tail.next = new Node((s[i].charAt(0)));

        return head;
    }

    public static void printList(Node node, PrintWriter out) {
        while (node != null) {
            out.print(node.data + " ");
            node = node.next;
        }
        out.println();
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

            Node head = Node.inputList(br);

            String S = br.readLine().trim();

            Solution obj = new Solution();
            ArrayList<Node> res = obj.findAnagrams(head, S);

            for (Node node : res) {
                Node temp = node;
                Node.printList(temp, out);
            }
            if (res.size() == 0) {
                out.println("-1");
            }
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java
/*

Definition for singly Link List Node
class Node
{
    char data;
    Node next;

    Node(char x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<Node> findAnagrams(Node head, String s) {
        ArrayList<Node> ans = new ArrayList<>();
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            arr1[ch - 'a']++;
        }
        int n = s.length();
        int count = 0;
        Node ptr = head;
        Node curr = head;
        while(ptr!=null){
            count++;
            char c = ptr.data;
            arr2[c - 'a']++;
            if(count == n){
                if(isAnagram(arr1,arr2)){
                    Node next = ptr.next; 
                    ptr.next = null; 
                    ans.add(curr); 
                    ptr = next; 
                    curr = ptr;  
                    count = 0;
                    Arrays.fill(arr2,0);
                }else{
                    char ch1 = curr.data;
                    arr2[ch1 - 'a']--;
                    ptr = ptr.next;
                    curr = curr.next;
                    count--;
                }
            }else{
                ptr = ptr.next;
            }
        }
        return ans;
    }
    public static boolean isAnagram(int arr1[], int arr2[]){
        for(int i=0; i<26; i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}