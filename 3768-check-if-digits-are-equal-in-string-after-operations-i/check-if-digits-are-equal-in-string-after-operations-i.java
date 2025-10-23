class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            String temp = "";
            for(int i = 1;i<s.length();i++){
                int a = s.charAt(i-1) - '0';
                int b = s.charAt(i) - '0';
                int val = (a+b)%10;
                temp += val + "";
            }
            s = temp;
        }
        return s.charAt(0) == s.charAt(1);
    }
}
