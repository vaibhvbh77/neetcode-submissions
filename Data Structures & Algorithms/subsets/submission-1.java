class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
             sub(nums, 0, new ArrayList<>());
           return ans;
    }
      public void sub(int[] nums, int index, List<Integer> curr) {
       ans.add(new ArrayList<>(curr));

       for(int i=index;i<nums.length;i++){
        curr.add(nums[i]);
        sub(nums,i+1,curr);
        curr.remove(curr.size()-1);
       }

    }
}
