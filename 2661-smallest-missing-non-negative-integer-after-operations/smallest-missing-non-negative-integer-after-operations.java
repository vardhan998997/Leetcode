class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int remainders[] = new int[value];

        for(int num : nums){
            int rem = ((num%value) + value) % value;
            remainders[rem]++;
        }

        int result = 0;
        while (remainders[result % value] > 0) {
            remainders[result % value]--;
            result++;
        }
        return result;
    }
}
