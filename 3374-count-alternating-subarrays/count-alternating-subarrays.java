class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        int n = nums.length;
        long total = 0;
        int i = 0;

        while (i < n) {
            int count = 1;
            int j = i + 1;

            while (j < n && nums[j] != nums[j - 1]) {
                count++;
                j++;
            }

            
            total += (long) count * (count + 1) / 2;

           
            i = j;
        }

        return total;
    }
}
