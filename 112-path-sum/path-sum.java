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
    boolean isDone = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        ishelper(root, targetSum, 0);
        return isDone;
    }

    public void ishelper(TreeNode root, int targetSum, int temp){
        if(root==null){
            return;
        }

        temp += root.val;
        if(root.left==null && root.right==null && temp==targetSum){
            isDone = true;
            return;
        }

        ishelper(root.left, targetSum, temp);
        ishelper(root.right, targetSum, temp);
    }
}
