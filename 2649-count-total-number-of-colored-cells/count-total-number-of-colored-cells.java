class Solution {
    public long coloredCells(int n) {
        long v = (long)n;
        return v * v + (v-1) * (v-1);
    }
}