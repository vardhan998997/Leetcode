class Solution {
    public int jump(int[] nums) {
        int n = nums.length, jumps = 0, l = 0,r=0, foremost = 0;
        while(r<n-1){

            for(int i = l;i<=r;i++){
                foremost = Math.max(foremost, nums[i]+i);
            }

            l = r + 1;
            r = foremost;
            jumps++;
        }
        return jumps;
    }
}
