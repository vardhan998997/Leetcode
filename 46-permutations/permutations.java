class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        permutations(0, nums.length, nums, ans);
        return ans;
    }

    public void permutations(int start, int n, int[] nums, ArrayList<List<Integer>> ans){
        if(start==n){
            List<Integer> temp = new ArrayList<>();
            for(int num : nums) temp.add(num);
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = start;i<n;i++){
            swap(start, i, nums);
            permutations(start+1, n, nums, ans);
            swap(start, i, nums);
        }
    }

    public void swap(int i, int j, int[] nums){
        if(i!=j){
            nums[i] = nums[i] ^ nums[j]; 
            nums[j] = nums[i] ^ nums[j]; 
            nums[i] = nums[i] ^ nums[j]; 
        }
    }
}