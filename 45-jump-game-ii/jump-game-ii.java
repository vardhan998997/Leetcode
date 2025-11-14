class Solution {
    public int jump(int[] nums) {
        int n = nums.length, l = 0, r = 0, forbidden = 0, min_jumps = 0;
        
        while(r<n-1){

            for(int i = l;i<=r;i++){
                forbidden = Math.max(forbidden, nums[i]+i);
            }

            min_jumps++;
            l = r+1;
            r = forbidden;
        }
        return min_jumps;
    }
}