class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int space = 0, known = 0;
        for(char ch : moves.toCharArray()){
            if(ch=='_'){
                space++;
            }else if(ch=='R'){
                known++;
            }else{
                known--;
            }
        }

        return Math.abs(known) + space;
    }
}
