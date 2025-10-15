class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size(), prev = 0, cnt = 1, ans = 0, a = 0 , b = 0;
        for(int i = 1;i<n;i++){
            if(nums.get(i) > nums.get(i-1)){
                cnt++;
            }else{
                a = Math.min(prev, cnt);
                b = Math.max(prev/2, cnt/2);
                ans = Math.max(ans, Math.max(a, b));
                prev = cnt;
                cnt = 1;
            }
        }
            a = Math.min(prev, cnt);
            b = Math.max(prev/2, cnt/2);
            ans = Math.max(ans, Math.max(a, b));
        return ans;
    }
}
