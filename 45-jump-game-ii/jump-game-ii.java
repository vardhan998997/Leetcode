class Solution {
    public int jump(int[] nums) {
        int r = 0, l = 0, foremost = 0, steps = 0, n = nums.length;
        if(n==1) return 0;

        while(r<n){
            for(int i = l;i<=r;i++){
                foremost = Math.max(foremost, nums[i]+i);
            }

            l = r + 1;
            r = foremost;

            steps++;

            if(foremost>=n-1){
                break;
            }
        }
        return steps;
    }
}
