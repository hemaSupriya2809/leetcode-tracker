// Last updated: 7/9/2026, 9:19:13 AM
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
    List<Integer> li=new ArrayList<>();
    void preOrder(TreeNode root){
        if(root!=null){
            li.add(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        preOrder(root);
        return li;
     
    }
}