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
    public int kthLargestPerfectSubtree(TreeNode root, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        ishelper(root, queue);
        
        for(int i = 0;i<k-1 && !queue.isEmpty();i++){
            queue.poll();
        }
        return queue.isEmpty() ? -1 : queue.peek();
    }

    public int ishelper(TreeNode root, PriorityQueue<Integer> queue){
        if(root==null) return 0;

        int left = ishelper(root.left, queue);
        int right = ishelper(root.right, queue);

        if(left==-1 || right==-1 || left!=right) return -1;

        int val = left + right + 1;
        queue.offer(val);

        return val;
    }
}
