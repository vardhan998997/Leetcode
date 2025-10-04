class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        ishelper(candidates, target, 0, candidates.length, temp, ans);
        return ans;
    }

    public void ishelper(int[] nums, int target, int idx, int n, ArrayList<Integer> temp, ArrayList<List<Integer>> ans){
        if(idx==n){
            if(target==0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }

        if(nums[idx]<=target){
            temp.add(nums[idx]);
            ishelper(nums, target-nums[idx], idx, n, temp, ans);
            temp.remove(temp.size()-1);
        }
        ishelper(nums, target, idx+1, n, temp, ans);
    }
}
