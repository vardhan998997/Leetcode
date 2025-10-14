class Solution {
    public int maximumPossibleSize(int[] nums) {
        int n = nums.length, prev = -1, cnt = 0;
        for(int num : nums){
            if(num>=prev){
                cnt++;
                prev = num;
            }
        }
        return cnt;
    }
}
