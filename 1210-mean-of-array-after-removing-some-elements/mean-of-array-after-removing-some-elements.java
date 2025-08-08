class Solution {
    public double trimMean(int[] arr) {
        int n = arr.length;
        double index = 0.05 * n;
        Arrays.sort(arr);
        int sum = 0;
        for(int i = (int)index; i<n - index;i++){
            sum += arr[i];
        }
        double ans = sum / (n - 2 * index);
        return ans;
    }
}