class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> sortVowels = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(isVowel(ch)){
                sortVowels.add(ch);
            }
        }
        Collections.sort(sortVowels);

        int k = 0, i = 0; String ans = "";
        for(char ch : s.toCharArray()){
            if(isVowel(ch)){
                ans += sortVowels.get(k++);
            }else{
                ans += s.charAt(i);
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
