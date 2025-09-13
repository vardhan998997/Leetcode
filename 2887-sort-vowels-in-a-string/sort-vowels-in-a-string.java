class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> sortVowels = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(isVowel(ch)){
                sortVowels.add(ch);
            }
        }
        Collections.sort(sortVowels);

        StringBuilder sb = new StringBuilder(s);
        int k = 0; String ans = ""; int i = 0;
        for(char ch : s.toCharArray()){
            if(isVowel(ch)){
                ans += sortVowels.get(k++);
            }else{
                ans += sb.charAt(i);
            }
            i++;
        }
        return ans;
    }
    public boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}