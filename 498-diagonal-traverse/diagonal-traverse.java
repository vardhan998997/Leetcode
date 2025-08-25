class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<int[]> queue = new LinkedList<>();

        // Add first row and last column starting points
        for (int j = 0; j < m; j++) queue.offer(new int[]{0, j});
        for (int i = 1; i < n; i++) queue.offer(new int[]{i, m - 1});

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            ArrayList<Integer> temp = new ArrayList<>();
            dfs(mat, temp, cell[0], cell[1], n, m);
            ans.add(temp);
        }

        int[] res = new int[n * m];
        int k = 0, count = 0;

        for (ArrayList<Integer> l : ans) {
            if (count % 2 == 1) { 
                for (int e : l) res[k++] = e;
            } else { 
                for (int i = l.size() - 1; i >= 0; i--) res[k++] = l.get(i);
            }
            count++;
        }
        return res;
    }

    public static void dfs(int[][] mat, ArrayList<Integer> temp, int row, int col, int n, int m) {
        if (row < 0 || col < 0 || row >= n || col >= m) return;
        temp.add(mat[row][col]);
        dfs(mat, temp, row + 1, col - 1, n, m);
    }
}
