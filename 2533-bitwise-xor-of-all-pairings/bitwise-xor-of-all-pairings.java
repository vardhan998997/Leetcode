class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1 = 0, xor2 = 0;

        for(int nums : nums1) xor1 ^= nums;
        for(int nums : nums2) xor2 ^= nums;

        int n1 = nums1.length, n2 = nums2.length;
        if((n1%2==0) && (n2%2==0)) return 0;
        if((n1%2==0) && (n2%2==1)) return xor1;
        if((n1%2==1) && (n2%2==0)) return xor2;

        return xor1 ^ xor2;
    }
}
