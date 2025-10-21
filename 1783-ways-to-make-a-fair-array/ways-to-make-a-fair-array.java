class Solution {
    public int waysToMakeFair(int[] nums) {
        int n = nums.length;
        int prefEven[] = new int[n+1];
        int prefOdd[] = new int[n+1];

        for(int i = 0;i<n;i++){
            prefEven[i+1] = prefEven[i];
            prefOdd[i+1] = prefOdd[i];

            if(i%2 == 0){
                prefEven[i+1] += nums[i];
            }else{
                prefOdd[i+1] += nums[i];
            }
        }

        int fair = 0;
        for(int i = 0;i<n;i++){
            int EvenSum = prefEven[i] + (prefOdd[n] - prefOdd[i+1]);
            int OddSum = prefOdd[i] + (prefEven[n] - prefEven[i+1]);

            if(EvenSum == OddSum){
                fair++;
            }
        }
        return fair;
    }
}
