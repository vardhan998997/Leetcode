class Solution {
    public boolean canJump(int[] nums) {
        int max_jump = 0, n = nums.length;
        for(int i = 0;i<n;i++){
            if(max_jump<i) return false;

            max_jump = Math.max(max_jump, nums[i]+i);
            if(max_jump>n-1) return true;
        }
        return true;
    }
}
