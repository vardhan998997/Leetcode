class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size(), count = 1;
        if(k==1) return true;
        if(k*2>n) return false;
        int prev = 0;

        for(int i = 1;i<n;i++){
            if(nums.get(i)>nums.get(i-1)){
                count++;
            }else{
                prev = count;
                count = 1;
            }
            if(prev==1) prev = 0;

            if(count!=1 && count>=k && prev>=k || count >= k * 2){
                return true;
            }
        }
        return false;
    }
}
