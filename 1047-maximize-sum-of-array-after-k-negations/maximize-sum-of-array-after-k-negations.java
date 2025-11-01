import java.util.*;

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n && k > 0; i++) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
                k--;
            } else {
                break;
            }
        }

        int min = Arrays.stream(nums).min().getAsInt();
        if (k % 2 == 1) {
            int minAbs = Math.abs(min);
            for (int i = 0; i < n; i++) {
                if (Math.abs(nums[i]) == minAbs) {
                    nums[i] = -nums[i];
                    break;
                }
            }
        }

        return Arrays.stream(nums).sum();
    }
}
