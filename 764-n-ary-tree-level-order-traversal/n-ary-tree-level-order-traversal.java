/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        queue.offer(root);

        while(queue.size()>0){
            List<Integer> level = new ArrayList<>();
            int lev = queue.size();
            for(int i = 0; i<lev; i++){
                Node polled = queue.poll();
                queue.addAll(polled.children);
                level.add(polled.val);
            }
            ans.add(level);
        }
        return ans;
    }
}