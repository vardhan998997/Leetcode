class Solution {
    public int[] productQueries(int n, int[][] queries) {
        final int MOD = 1_000_000_007;
        List<Integer> powers = new ArrayList<>();

        for (int i = 0; i < 31; i++) {
            if ((n & (1 << i)) != 0) {
                powers.add(1 << i);
            }
        }


        int len = queries.length;
        int[] ans = new int[len];

        for (int k = 0; k < len; k++) {
            int st = queries[k][0], end = queries[k][1];
            long product = 1;

            for (int i = st; i <= end; i++) {
                product = (product * powers.get(i)) % MOD;
            }
            ans[k] = (int) product;
        }
        return ans;
    }
}
