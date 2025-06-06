class Solution {
    public int maxSumDivThree(int[] nums) {
        int n = nums.length;
        int dp[] = new int[3];
        for(int num: nums){
            int temp[] = dp.clone();

            for(int j = 0;j<3;j++){
                int div = temp[j] + num;
                dp[div%3] = Math.max(div, dp[div%3]);
            }
        }
        return dp[0];
    }
}