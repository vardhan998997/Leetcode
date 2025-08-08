class Solution {
    public boolean judgeCircle(String moves) {
        int c1 = 0 , c2 = 0;
        for(char ch : moves.toCharArray()){
            if(ch == 'U'){
                c1++;
            }else if(ch == 'D'){
                c1--;
            }else if(ch == 'R'){
                c2++;
            }else{
                c2--;
            }
        }
        return c1==0 && c2==0;
    }
}
