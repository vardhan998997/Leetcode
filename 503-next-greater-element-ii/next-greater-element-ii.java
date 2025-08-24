class Solution {
    public int[] nextGreaterElements(int[] nums) {

        //// for traversing two times cause, finding the next gre for the last element

        int n = nums.length;
        int ans[] = new int[n];

        Stack<Integer> stack = new Stack<>();
        for(int i = n * 2 - 1;i>=0;i--){
            int current = nums[i%n];

            while(!stack.isEmpty() && stack.peek()<=current){
                stack.pop();
            }

            if(i<n){
                ans[i] = stack.isEmpty() ? -1 : stack.peek();
            }

            stack.push(current);
        }
        return ans;
    }
}
