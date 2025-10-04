class Solution {
    public int maxArea(int[] height) {
        int left_max = 0, right_max = 0, l = 0, r = height.length-1, max_water = 0;

        while(l<=r){
            left_max = Math.max(height[l], left_max);
            right_max = Math.max(height[r], right_max);

            int min = Math.min(left_max, right_max);
            max_water = Math.max(max_water , min * (r-l));

            if(left_max<right_max){
                l++;
            }else{
                r--;
            }
        }
        return max_water;
    }
}