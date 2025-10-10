class Solution {
    public boolean queryString(String s, int n) {
        for(int i = 1;i<=n;i++){
            String temp = Integer.toBinaryString(i);
            if(!s.contains(temp)){
                return false;
            }
        }
        return true;
    }
}