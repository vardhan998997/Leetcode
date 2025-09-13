class Solution {
    public String sortVowels(String s) {
        int[] sortVowels = new int[123];

        for(char ch : s.toCharArray()){
            if(isVowel(ch)){
                sortVowels[ch]++;
            }
        }

        String vow = "";
        for(int i = 0;i<123;i++){
            int count = sortVowels[i];
            while(count>0){
                vow += (char)i;
                count--;
            }
        }
        System.out.println(vow);

        int k = 0, i = 0; String ans = "";
        for(char ch : s.toCharArray()){
            if(isVowel(ch)){
                ans += vow.charAt(k++);
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
