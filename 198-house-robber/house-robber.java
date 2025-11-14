class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int prev2 = 0, prev = nums[0], curr = 0;
        for(int i = 1;i<n;i++){
            int take = prev2 + nums[i];
            int nottake = prev;
            curr = Math.max(take, nottake);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}