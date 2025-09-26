class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int n = heights.length, pse = 0, nse = 0, maxLen = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                int element = stack.pop();
                pse = stack.isEmpty() ? -1 : stack.peek();
                maxLen = Math.max(maxLen, heights[element] * (i - pse - 1));
            }
        stack.push(i);
        }


        while(!stack.isEmpty()){
            nse = n;
            int element = stack.pop();
            pse = stack.isEmpty() ? -1 : stack.peek();
            maxLen = Math.max(maxLen, heights[element] * (nse - pse - 1));
        }
        return maxLen;
    }
}
