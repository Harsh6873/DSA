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
    public int rob(TreeNode root) {
        int[] answer = helper(root);
        return Math.max(answer[0],answer[1]);
    }
    public int[] helper(TreeNode root){
        if(root == null)
            return new int[]{0,0};
        int[] left = helper(root.left);
        int[] right = helper(root.right);
        int rob = root.val+left[1] + right[1];
        int notrob = Math.max(left[0],left[1]) + Math.max(right[0],right[1]);
        return new int[] {rob,notrob};
    }
}