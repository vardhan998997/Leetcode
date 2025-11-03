class Solution {
    public int minCost(String colors, int[] neededTime) {
        Stack<Integer> stack = new Stack<>();
        int n = neededTime.length, minTime = 0;
        if(n==0 || n==1) return 0;  
        char prev = colors.charAt(0);

        for(int i = 0;i<n;i++){
            if(!stack.isEmpty()){
                if(colors.charAt(i) == prev){
                    if(stack.peek()<neededTime[i]){
                        minTime += stack.pop();
                        stack.push(neededTime[i]);
                    }else{
                        minTime += neededTime[i];
                    }
                }else{
                    stack.push(neededTime[i]);
                }
            }else{
                stack.push(neededTime[i]);
            }
            prev = colors.charAt(i);
        }
        return minTime;
    }
}
