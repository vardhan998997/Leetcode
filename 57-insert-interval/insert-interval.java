class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int tempIntervals[][] = new int[n+1][2];
        for(int i = 0;i<n;i++){
            tempIntervals[i][0] = intervals[i][0];
            tempIntervals[i][1] = intervals[i][1];
        }
        tempIntervals[n][0] = newInterval[0];
        tempIntervals[n][1] = newInterval[1];

        int k = 0;
        Arrays.sort(tempIntervals, (a,b) -> Integer.compare(a[0], b[0]));

        for(int i = 1;i<=n;i++){
            if(tempIntervals[k][1]>=tempIntervals[i][0]){
                tempIntervals[k][1] = Math.max(tempIntervals[k][1] , tempIntervals[i][1]);
            }else{
                k++;
                tempIntervals[k] = tempIntervals[i];
            }
        }
        return Arrays.copyOfRange(tempIntervals, 0, k+1);
    }
}
