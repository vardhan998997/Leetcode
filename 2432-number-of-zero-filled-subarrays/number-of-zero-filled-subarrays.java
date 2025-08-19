class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n = nums.length;
        int l = 0;
        long ans = 0, cnt = 0;
        for(int r = 0;r<n;r++){
            if(nums[r]==0){
                cnt++;
            }else{
                ans += (cnt * (cnt + 1)/2);
                cnt = 0;
            }
        }
        ans += (cnt * (cnt + 1)/2);
        return ans;
    }
}
