class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Character,Integer> sMpp = new HashMap<>();
        HashMap<Character,Integer> pMpp = new HashMap<>();
        if(s.length()<p.length()) return ans;

        for(char ch : p.toCharArray()){
            pMpp.put(ch, pMpp.getOrDefault(ch, 0)+1);
        }

        for(int i = 0;i<p.length();i++){
            char ch = s.charAt(i);
            sMpp.put(ch, sMpp.getOrDefault(ch,0)+1);
        }

        if(sMpp.equals(pMpp)){
            ans.add(0);
        }

        for(int i = p.length();i<s.length();i++){
            char endChar = s.charAt(i);

            sMpp.put(endChar, sMpp.getOrDefault(endChar, 0)+1);
            char stChar = s.charAt(i-p.length());
            if(sMpp.get(stChar)==1){
                sMpp.remove(stChar);
            }else{
                sMpp.put(stChar, sMpp.getOrDefault(stChar, 0)-1);
            }

            if(sMpp.equals(pMpp)){
                ans.add(i-p.length()+1);
            }
        }
        return ans;
    }
}
