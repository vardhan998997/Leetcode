class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int prev2 = 0, prev = nums[0], curr = 0;

        for(int i = 1;i<n;i++){
            int take = nums[i] + prev2;
            int nottake = 0 + prev;
            curr = Math.max(take, nottake);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}