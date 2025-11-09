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
    int ans = 0;
    public int maxDepth(TreeNode root) {
        findMaxDepth(root, 0);
        return ans;
    }

    public void findMaxDepth(TreeNode root, int temp){
        if(root == null){
            ans = Math.max(ans, temp);
            return;
        }

        findMaxDepth(root.left, temp+1);
        findMaxDepth(root.right, temp+1);
    }
}
