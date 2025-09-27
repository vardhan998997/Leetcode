class Solution {
    public List<Integer> twoOutOfThree(int[] arr1, int[] arr2, int[] arr3) {
        int nums1[] = Arrays.stream(arr1).distinct().toArray();
        int nums2[] = Arrays.stream(arr2).distinct().toArray();
        int nums3[] = Arrays.stream(arr3).distinct().toArray();

        int[] freq = new int[101];
        for(int i = 0;i<nums1.length;i++){
                freq[nums1[i]]++;
        }

        for(int i = 0;i<nums2.length;i++){
                freq[nums2[i]]++;
        }

        for(int i = 0;i<nums3.length;i++){
                freq[nums3[i]]++;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 1;i<=100;i++){
            if(freq[i]>1){
                ans.add(i);
            }
        }
        return ans;
    }
}