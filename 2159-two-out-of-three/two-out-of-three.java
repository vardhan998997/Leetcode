class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        int[] freq1 = new int[101];
        int[] freq2 = new int[101];
        int[] freq3 = new int[101];

        for(int i = 0;i<nums1.length;i++){
                freq1[nums1[i]]++;
        }

        for(int i = 0;i<nums2.length;i++){
                freq2[nums2[i]]++;
        }

        for(int i = 0;i<nums3.length;i++){
                freq3[nums3[i]]++;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 1;i<=100;i++){
            if(freq1[i]>0 && freq2[i]>0 || freq2[i]>0 && freq3[i]>0 || freq3[i]>0 && freq1[i]>0){
                ans.add(i);
            }
        }
        return ans;
    }
}
