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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> li = new ArrayList<Integer>();
        if(root == null) return li;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            // System.out.print(temp.data+" ");
            li.add(temp.val);
            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left!= null){
                stack.push(temp.left);
            }
        }
        return li;
// //         if(root == null){
// //             return;
// //         }
//         List<Integer> li = new ArrayList<Integer>();
//         dfs(root,li);
//         return li;
// //         li.add(root);
// //         li.add(preorderTraversal(root.left));
        
// //         li.add(preorderTraversal(root.right));
        
        
        
//     }
//     private void dfs(TreeNode node , List<Integer> list){
//         if(node == null) return;
//         list.add(node.val);
//         dfs(node.left,list);
//         dfs(node.right,list);
    }
}