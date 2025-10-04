class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l = 0, r = n - 1, left_max = 0, right_max = 0, max_water = 0;
        while(l<r){
            left_max = Math.max(left_max, height[l]);
            right_max = Math.max(right_max, height[r]);

            if(left_max<right_max){
                max_water += left_max - height[l];
                l++;
            }else{
                max_water += right_max - height[r];
                r--;
            }
        }
        return max_water;
    }
}