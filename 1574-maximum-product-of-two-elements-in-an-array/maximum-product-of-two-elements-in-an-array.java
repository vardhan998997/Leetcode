class Solution {
    public int maxProduct(int[] nums) {
        int second_largest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE;
        for(int num : nums){
            if(num >= largest){
                second_largest = largest;
                largest = num;
            }else if(num > second_largest){
                second_largest = num;
            }
        }

        return (largest - 1) * (second_largest - 1);
    }
}