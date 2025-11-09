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
    boolean balanced = true;
    public boolean isBalanced(TreeNode root) {
        ishelper(root);
        return balanced;
    }

    public int ishelper(TreeNode root){
        if(root==null) return 0;

        int left = ishelper(root.left);
        int right = ishelper(root.right);
        if(Math.abs(left - right) > 1){
            balanced = false;
        }

        return Math.max(left, right) + 1;
    }
}
