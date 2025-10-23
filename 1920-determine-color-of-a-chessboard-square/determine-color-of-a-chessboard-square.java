class Solution {
    public boolean squareIsWhite(String coordinates) {
        int first = (int)(coordinates.charAt(0) - 'a') + 1;
        int second = coordinates.charAt(1);


        if(first%2 == second%2){
            return false;
        }
        return true;
    }
}

