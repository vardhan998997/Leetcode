class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int Ones = 0, zeros = 0;
        int l = 0 , max_ones = 0;
        for(int r = 0;r<n;r++){
            if(nums[r]==1){
                Ones++;
            }else{
                zeros++;
            }

            while(zeros>1){
                if(nums[l]==1){
                    Ones--;
                }else{
                    zeros--;
                }
                l++;
            }

            max_ones = Math.max(max_ones, Ones);
        }
        return max_ones==n ? max_ones-1 : max_ones;
    }
}
