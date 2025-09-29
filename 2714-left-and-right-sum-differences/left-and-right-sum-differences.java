class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left_sum = 0, right_sum = 0;
        for(int i = 1;i<n;i++){
            right_sum += nums[i];
        }

        int k = 0;
        res[k++] = right_sum;
        for(int i = 1;i<n;i++){
            right_sum -= nums[i];
            left_sum += nums[i-1];
            res[k++] = Math.abs(left_sum - right_sum);
        }
        return res;
    }
}
