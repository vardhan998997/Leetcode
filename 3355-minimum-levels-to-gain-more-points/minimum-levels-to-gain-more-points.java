class Solution {
    public int minimumLevels(int[] possible) {
        int Alice = 0, Bob = 0;
        for(int i : possible){
            if(i == 0){
                --Bob;
            }else{
                ++Bob;
            }
        }

        int n = possible.length;

        for(int i = 0;i<n-1;i++){
            if(possible[i] == 0){
                Alice -= 1;
                Bob += 1;
            }else{
                Alice += 1;
                Bob -= 1;
            }

            if(Alice > Bob){
                return i + 1;
            }
        }
        return -1;
    }
}
