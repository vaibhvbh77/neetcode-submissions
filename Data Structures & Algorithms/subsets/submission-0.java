class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
             sub(nums, 0, new ArrayList<>());
           return ans;
    }
      public void sub(int[] nums, int index, List<Integer> curr) {
        if(nums.length==index){
            ans.add(new ArrayList<>(curr));
            return;
        }
        sub(nums,index+1,curr);

        curr.add(nums[index]);
        sub(nums,index+1,curr);

        
        curr.remove(curr.size() - 1);

    }
}
