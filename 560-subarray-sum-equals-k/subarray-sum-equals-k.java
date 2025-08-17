class Solution {
    public int subarraySum(int[] nums, int k) {
       int n = nums.length;
        int prefSum = 0, ans = 0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,1);


        for(int i = 0;i<n;i++){
            prefSum += nums[i];

            if(mpp.containsKey(prefSum-k)){
                ans += mpp.get(prefSum - k);
            }

            mpp.put(prefSum, mpp.getOrDefault(prefSum, 0)+1);
        }
        return ans;
    }
}
