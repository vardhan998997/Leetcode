class Solution {
    public int valueAfterKSeconds(int n, int k) {
        long temp[] = new long[n];
        Arrays.fill(temp, 1);
        long prefSum = 0;
        final int mod = 1000000007;

    for(int j = 1;j<=k;j++){
        prefSum = 1;
        for(int i = 1;i<n;i++){
            prefSum = (int)(prefSum + temp[i]) % mod;
            temp[i] = prefSum;
        }
    }
        return (int)temp[n-1] % mod;
    }
}
