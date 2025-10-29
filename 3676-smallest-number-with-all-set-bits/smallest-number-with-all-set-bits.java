class Solution {
    public int smallestNumber(int n) {
        for(int i = n;i>=0;i++){
            String binary = Integer.toBinaryString(i);
            int bitCount = Integer.bitCount(i);
            if(binary.length()-bitCount == 0) return i;
        }
        return -1;
    }
}
