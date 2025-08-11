class Solution {
    int end1, end2;

    public int[][] findFarmland(int[][] land) {
        int n = land.length, m = land[0].length;
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (land[i][j] == 1) {
                    end1 = i; end2 = j;
                    dfs(i, j, n, m, land);
                    result.add(new int[]{i, j, end1, end2});
                }
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public void dfs(int row, int col, int n, int m, int[][] land) {
        if (row < 0 || col < 0 || row >= n || col >= m || land[row][col] == 0) {
            return;
        }

        land[row][col] = 0;
        if (row > end1 || (row == end1 && col > end2)) {
            end1 = row;
            end2 = col;
        }

        dfs(row + 1, col, n, m, land);
        dfs(row - 1, col, n, m, land);
        dfs(row, col + 1, n, m, land);
        dfs(row, col - 1, n, m, land);
    }
}
