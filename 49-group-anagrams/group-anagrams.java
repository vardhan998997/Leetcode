class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mpp = new HashMap<>();
        for(String s : strs){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);

            if(!mpp.containsKey(sorted)){
                mpp.put(sorted, new ArrayList<>());
            }
            mpp.get(sorted).add(s);
        }

        return new ArrayList<>(mpp.values());
    }
}

