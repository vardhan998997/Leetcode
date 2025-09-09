class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tot_gas = 0, tot_cost = 0, tank = 0, st = 0;

        for(int i = 0;i<gas.length;i++){
            tot_gas += gas[i];
            tot_cost += cost[i];
            tank += gas[i] - cost[i];

            if(tank<0){
                st = i + 1;
                tank = 0;
            }
        }
        return tot_gas<tot_cost ? -1 : st;
    }
}