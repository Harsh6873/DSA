/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st = new Stack<>();
        while(l1 != null){
            st.push(l1.val);
            l1 = l1.next;
        }
        Stack<Integer> s2 = new Stack<>();
        while(l2 != null){
            s2.push(l2.val);
            l2 = l2.next;
        }
        int carry=0;
        ListNode newhead = null;
        while(!st.isEmpty() || !s2.isEmpty() || carry != 0){
            int n1 = st.isEmpty() ? 0 : st.pop();
            int n2 = s2.isEmpty() ? 0 : s2.pop();
            int tmp = n1+n2+carry;
            ListNode newNode = new ListNode(tmp%10);
            newNode.next = newhead;
            newhead = newNode;
            carry = tmp/10;
        }
        return newhead;
    }
}