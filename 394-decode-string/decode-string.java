class Solution {
    int i = 0;
    public String decodeString(String s) {
        i = 0;
        return decode(s);
    }

    private String decode(String s){
        StringBuilder res = new StringBuilder();
        int num = 0;
        while(i<s.length()){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num = num * 10 + (ch - '0');
                i++;
            }else if(ch=='['){
                i++;
                String inner = decode(s);
                for(int k = 0;k<num;k++) res.append(inner);
                num = 0;
            }else if(ch==']'){
                i++;
                return res.toString();
            }else{
                res.append(ch);
                i++;
            }
        }
        return res.toString();
    }
}