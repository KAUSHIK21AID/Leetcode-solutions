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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer>nums = new ArrayList<>();
        while(head!=null)
        {
            nums.add(head.val);
            head = head.next;
        }
        if(nums.size()<=2)
        {
            return new int[]{-1,-1};
        }
        List<Integer>indices = new ArrayList<>();
        for(int i=1;i<nums.size()-1;i++)
        {
            if(nums.get(i)>nums.get(i-1) && nums.get(i)>nums.get(i+1))
            {
                indices.add(i);
            }

            if(nums.get(i)<nums.get(i-1) && nums.get(i)<nums.get(i+1))
            {
                indices.add(i);
            }
        }
        if(indices.size()<2)
        {
            return new int[]{-1,-1};
        }
        int ans[] = new int[2];
        int m = Integer.MAX_VALUE;
        for(int i=1;i<indices.size();i++)
        {
            m = Math.min(m,indices.get(i)-indices.get(i-1));
        }
        ans[0] = m;
        ans[1] = indices.get(indices.size()-1)-indices.get(0);

        return ans;
    }
}