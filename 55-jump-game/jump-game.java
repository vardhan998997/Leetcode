class Solution {
    public boolean canJump(int[] nums) {
        int max_moves = 0, n = nums.length;
        for(int i = 0;i<n;i++){
            if(max_moves<i){
                return false;
            }

            max_moves = Math.max(max_moves, nums[i] + i);

            if(max_moves > n-1){
                return true;
            }
        }
        return true;
    }
}
