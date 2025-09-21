class Solution {
    public int minSteps(int n) {
        int min_steps = 0, i = 2;
        while(n>1){
            if(n%i==0){
                min_steps += i;
                n /= i;
            }else{
                i++;
            }
        }
        return min_steps;
    }
}
