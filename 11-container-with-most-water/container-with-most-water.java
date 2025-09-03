class Solution {
    public int maxArea(int[] height) {
        int max_water = 0, l = 0, r = height.length-1, min = 0, sum = 0;
        while(l<r){
            min = Math.min(height[l], height[r]);
            sum = min * (r-l);
            max_water = Math.max(max_water, sum);

            while(l<r && height[l]<=min) l++;
            while(l<r && height[r]<=min) r--;
        }
        return max_water;
    }
}