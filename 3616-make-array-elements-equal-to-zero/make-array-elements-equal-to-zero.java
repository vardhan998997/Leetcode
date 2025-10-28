class Solution {
    int ans = 0;

    public int countValidSelections(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) continue; // must start from an index with value 0

            // Try moving left
            int leftTemp[] = nums.clone();
            isAllZeroes(-1, i - 1, n, leftTemp, -1);
            if (isTotalZeroes(leftTemp)) ans++;

            // Try moving right
            int rightTemp[] = nums.clone();
            isAllZeroes(1, i + 1, n, rightTemp, 1);
            if (isTotalZeroes(rightTemp)) ans++;
        }
        return ans;
    }

    public void isAllZeroes(int movement, int curr, int n, int[] temp, int dir) {
        if (curr < 0 || curr >= n) return;

        if (temp[curr] == 0) {
            // move in same direction
            isAllZeroes(movement, curr + movement, n, temp, dir);
        } else if (temp[curr] > 0) {
            // decrement and reverse direction
            temp[curr]--;
            isAllZeroes(-movement, curr - movement, n, temp, dir);
        }
    }

    public boolean isTotalZeroes(int[] temp) {
        for (int val : temp) {
            if (val != 0) return false;
        }
        return true;
    }
}
