class Solution {
    public String minimizeStringValue(String s) {
        StringBuilder sb = new StringBuilder(s);
        int freq[] = new int[26];
        for(char ch : s.toCharArray()){
            if(ch!='?') freq[ch-'a']++;
        }
        String replaced = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='?'){
                int idx = findMin(freq);
                freq[idx]++;
                replaced += (char)(idx + 'a') + "";
            }
        }
        char charc[] = replaced.toCharArray();
        Arrays.sort(charc);
        int idx = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='?'){
                sb.setCharAt(i,charc[idx++]);
            }
        }

        return sb.toString();
    }

    public int findMin(int[] freq){
        int min = Integer.MAX_VALUE;
        int idx = 0;
        for(int i = 0;i<freq.length;i++){
            if(freq[i]<min){
                min = freq[i];
                idx = i;
            }
            if(min == 0) return idx;
        }
        return idx;
    }
}
