class Solution {
    public int maxArea(int[] height) {
        int left_max = 0, right_max = 0, l = 0, r = height.length-1, max_water = 0;

        while(l<r){
            int min = Math.min(height[l], height[r]);
            max_water = Math.max(max_water , min * (r-l));

            while(l<r && height[l]<=min) l++;
            while(l<r && height[r]<=min) r--;
        }
        return max_water;
    }
}
