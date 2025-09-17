class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        ArrayList<int[]> arr = new ArrayList<>();
        for(int i = 0;i<position.length;i++){
            int[] pair = new int[2];
            pair[0] = position[i];
            pair[1] = speed[i];
            arr.add(pair);
        }

        arr.sort((a,b) -> b[0] - a[0]);
        double prev = -1;
        int cnt = 0;
        for(int[] car : arr){
            double time = (double) (target - car[0]) / car[1];

            if(time > prev){
                prev = time;
                cnt++;
            }
        }
        return cnt;
    }
}
