class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        HashSet<Character>[] row = new HashSet[n];
        HashSet<Character>[] col = new HashSet[n];
        HashSet<Character>[] boxes = new HashSet[n];

    for(int i = 0;i<n;i++){
        row[i] = new HashSet<Character>();
        col[i] = new HashSet<Character>();
        boxes[i] = new HashSet<Character>();
    }

    for(int r = 0;r<board.length;r++){
        for(int c = 0;c<board[0].length;c++){
            char cell = board[r][c];
            if(cell=='.'){
                continue;
            }
            if(row[r].contains(cell)){
                return false;
            }
            row[r].add(cell);
            if(col[c].contains(cell)){
                return false;
            }
            col[c].add(cell);
            int idx = 3 * (r/3) + (c/3);
            if(boxes[idx].contains(cell)){
                return false;
            }
            boxes[idx].add(cell);
        }
    }
        return true;
    }
}
