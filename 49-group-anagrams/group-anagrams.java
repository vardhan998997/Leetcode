class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mpp = new HashMap<>();
        for(String s : strs){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);

            if(mpp.containsKey(sorted)){
                mpp.get(sorted).add(s);
            }else{
                mpp.put(sorted, new ArrayList<>());
                mpp.get(sorted).add(s);
            }
        }

        List<List<String>> ans = new ArrayList<>();
        for(List<String> key : mpp.values()){
            ArrayList<String> temp = new ArrayList<>();
            for(String s : key){
                temp.add(s);
            }
            ans.add(new ArrayList<>(temp));
        }
        return ans;
    }
}

