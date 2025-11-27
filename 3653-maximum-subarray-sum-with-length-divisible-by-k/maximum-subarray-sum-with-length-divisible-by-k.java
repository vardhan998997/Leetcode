class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long[] minPrefix = new long[k];
        Arrays.fill(minPrefix, Long.MAX_VALUE);
        long result = Long.MIN_VALUE, prefix = 0;
        int r = 0;
        minPrefix[0] = 0;
        for(int i = 0;i<nums.length;i++){
            prefix += nums[i];
            r = (i+1)%k;

            if(minPrefix[r]!=Long.MAX_VALUE){
                result = Math.max(result, prefix - minPrefix[r]);
            }

            minPrefix[r] = Math.min(minPrefix[r], prefix);
        }
        return result;
    }
}
