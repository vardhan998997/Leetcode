class Solution {
    public long countAlternatingSubarrays(int[] nums) {
         int n = nums.length;
         long total = 0;
         int x = 0;
         while(x<n){
           int count = 1;
           int i = x + 1;
            for(;i<n;i++){
                if(nums[i-1]!=nums[i]){
                    count++;
                }else{
                    break;
                }
            }
            total += (long)count*(count+1)/2;
            x = i;
    }
    return total;
    }
}
