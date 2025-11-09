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
    public int diameterOfBinaryTree(TreeNode root) {
        ishelper(root, 0, 0);
        return ans;
    }

    public int ishelper(TreeNode root, int left, int right){
        if(root==null){
            return 0;
        }

        left = ishelper(root.left, left, right);
        right = ishelper(root.right, left, right);

        ans = Math.max(ans, left+right);
        return Math.max(left, right) + 1;
    }
}
