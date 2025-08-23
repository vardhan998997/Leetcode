class Solution {
    public long minIncrementOperations(int[] nums, int k) {
         long ans = 0, n = nums.length;
         for(int i = 1;i<n-1;i++){
            long c = Math.max((Math.max(nums[i-1], nums[i])) , nums[i+1]);
            if(c<k){
               long c1 = k - c;
                nums[i-1] += c1;
                nums[i] += c1;
                nums[i+1] += c1;
                ans += c1;
            }
         }
         return ans;
    }
}
