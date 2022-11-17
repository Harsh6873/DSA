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
    public ListNode swapPairs(ListNode head) {
        ListNode preNode = new ListNode(0);
        preNode.next = head;
        ListNode newHead = preNode;
        while(preNode.next != null && preNode.next.next != null){
            ListNode node1= preNode.next;
            ListNode node2 = node1.next;
            ListNode nextNode = node2.next;
            preNode.next = node2;
            node2.next = node1;
            node1.next = nextNode;
            preNode = node1;
        }
        return newHead.next;
    }
    
}