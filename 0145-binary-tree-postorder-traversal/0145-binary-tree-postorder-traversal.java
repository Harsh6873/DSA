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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        postorder(root,list);
        return list;
    }
    private void postorder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
       
        postorder(root.left,list);
        postorder(root.right,list);
            // st.push(root.left.val);
            // st.push(root.right.val);
            // st.push(root.)
            // int t = st.pop();
        list.add(root.val);
        
        // return lsit
    }
}