import java.util.Arrays;

class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int mod = 1000000007;
        int n = horizontalCuts.length, m = verticalCuts.length;
        int row = h;

        long maxH = Math.max(horizontalCuts[0], h - horizontalCuts[n-1]);
        for(int i = 1;i<n;i++){
            maxH = Math.max(maxH, horizontalCuts[i] - horizontalCuts[i-1]);
        }

        long maxV = Math.max(verticalCuts[0], w - verticalCuts[m-1]);
        for(int i = 1;i<m;i++){
            maxV = Math.max(maxV, verticalCuts[i] - verticalCuts[i-1]);
        }

        return (int)((maxH * maxV) % mod);
    }
}
