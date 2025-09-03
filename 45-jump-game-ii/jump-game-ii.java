class Solution {
    public int jump(int[] nums) {
        int r = 0, l = 0, foremost = 0, steps = 0, n = nums.length;

        while(r<n-1){

            for(int i = l;i<=r;i++){
                foremost = Math.max(foremost, nums[i]+i);
            }

            l = r + 1;
            r = foremost;
            steps++;
        }
        return steps;
    }
}
