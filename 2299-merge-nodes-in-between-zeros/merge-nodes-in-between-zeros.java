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
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        int cz = 0;
        ListNode h = head;
        ListNode newhead = new ListNode(0);
        ListNode ans = newhead;
        while(h!=null){
            if(h.val==0){
                cz = cz+1;
            }
            if(cz%2==0){
                ListNode j = new ListNode(sum);
                newhead.next = j;
                newhead = newhead.next;
                sum = 0;
                cz = 1;
            }
            else{
                sum = sum + h.val;
            }
            h = h.next;
        }
        return ans.next;
    }
}