class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length, idx = -1;
        for(int i = n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                idx = i-1;
                break;
            }
        }

        if(idx==-1){
            reverse(nums, 0, n-1);
            return;
        }
        
        for(int i = n-1;i>0;i--){
            if(nums[i]>nums[idx]){
                swap(nums, i , idx);
                break;
            }
        }

        reverse(nums, idx+1, n-1);
    }

    public void reverse(int[] nums, int i, int j){
        while(i<j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
