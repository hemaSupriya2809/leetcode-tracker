// Last updated: 7/9/2026, 9:18:56 AM
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode ret=new ListNode(0,head);
        ListNode current=ret;
        while(current!=null){
            while(current.next!=null && current.next.val==val){
                current.next=current.next.next;
            }
            current=current.next;
        }
        return ret.next;
    }
}