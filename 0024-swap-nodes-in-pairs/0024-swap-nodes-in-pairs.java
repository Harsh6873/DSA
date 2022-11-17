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
        // ListNode preNode = new ListNode(0);
        // preNode.next = head;
        // ListNode newHead = preNode;
        // while(preNode.next != null && preNode.next.next != null){
        //     ListNode node1= preNode.next;
        //     ListNode node2 = node1.next;
        //     ListNode nextNode = node2.next;
        //     preNode.next = node2;
        //     node2.next = node1;
        //     node1.next = nextNode;
        //     preNode = node1;
        // }
        // return newHead.next;
        if(head == null || head.next == null){
            return head;
        }
        ListNode p1 = head, p2 = head.next, p3 = p2.next;
        p1.next = p3;
        p2.next = p1;
        if(p3 != null)
            p1.next = swapPairs(p3);
        return p2;
    }
    
}