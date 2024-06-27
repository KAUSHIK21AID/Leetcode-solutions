/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int m = 0;
    public int diameterOfBinaryTree(TreeNode root) 
    {
        maxx(root);
        return m;
    }
    public int maxx(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int l = maxx(root.left);
        int r = maxx(root.right);
        m = Math.max(m, l+r);
        return Math.max(l,r)+1;
    }
}