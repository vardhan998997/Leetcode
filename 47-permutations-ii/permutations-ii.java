class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        helper(set, 0, nums);
        return new ArrayList<>(set);
    }

    public void helper(Set<List<Integer>> set, int start, int[] nums) {
        if (start == nums.length) {
            List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
            set.add(new ArrayList<>(list));
            return;
        }

        Set<Integer> swapped = new HashSet<>();
        for (int i = start; i < nums.length; i++) {
            if (swapped.contains(nums[i])) continue; 

            swapped.add(nums[i]);
            swap(i, start, nums);
            helper(set, start + 1, nums);
            swap(i, start, nums);
        }
    }

    public void swap(int i, int j, int[] nums) {
        if (i != j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
