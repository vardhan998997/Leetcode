class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length, prevIdx = 0;
        Stack<Integer> stack = new Stack<>();
        int result[] = new int[n];

        for(int i = 0;i<n;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                prevIdx = stack.pop();
                result[prevIdx] = i - prevIdx;
            }
            stack.push(i);
        }
        return result;
    }
}
