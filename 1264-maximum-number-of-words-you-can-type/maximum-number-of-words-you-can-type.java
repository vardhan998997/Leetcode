class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String stringArr[] = text.split(" ");
        int cnt = 0;
        for(String s : stringArr){
            boolean isflag = true;

            for(char ch : brokenLetters.toCharArray()){
                if(s.contains(ch+"")){
                    isflag = false;
                    break;
                }
            }
            if(isflag){
                cnt++;
            }
        }
        return cnt;
    }
}
