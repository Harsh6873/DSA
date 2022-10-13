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
//     private void inorder(TreeNode root, List<Integer> list){
        
//         if(root == null){
//             return;
//         }
//         inorder(root.left,list);
//         list.add(root.val);
//         inorder(root.right,list);
//         // return list;
        
//     }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        if(root == null){
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp!= null){
            if(temp!= null){
                stack.push(temp);
                temp = temp.left;
            }
            else{
                temp = stack.pop();
                list.add(temp.val);
                temp  = temp.right;
            }
            
        }
        // List<Integer> list = new LinkedList<Integer>();
        // inorder(root,list);
        return list;
    }
}