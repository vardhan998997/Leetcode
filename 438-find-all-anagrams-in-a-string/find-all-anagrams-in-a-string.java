class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = s.length(), len = p.length();
        for(int i = 0;i<s.length();i++){
            String str = s.substring(i, Math.min(i+len, n));
            if(isanagram(str, p)){
                ans.add(i);
            }
        }
        return ans;
    }

    public boolean isanagram(String a, String b){
        int freq[] = new int[26];
        for(char ch : a.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch : b.toCharArray()){
            freq[ch-'a']--;
        }

        for(int val : freq){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}
