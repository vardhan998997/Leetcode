class Solution {
    public List<String> removeAnagrams(String[] words) {
        int n = words.length;
        List<String> ans = new ArrayList<>();
        for(String word : words){
            ans.add(word);
        }

        for(int i = 1;i<words.length;i++){
            if(isAnagram(words[i-1], words[i])){
                ans.remove(words[i]);
            }
        }
        return ans;
    }

    public static boolean isAnagram(String a, String b){
        int[] freq = new int[26];
        for(char ch : a.toCharArray()) freq[ch-'a']++;
        for(char ch : b.toCharArray()) freq[ch-'a']--;
        for(int i : freq){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
