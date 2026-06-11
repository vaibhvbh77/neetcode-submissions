class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        helper(nums,target,0,new ArrayList<>());
        return ans;
    }
    public void helper(int[] nums, int target,int index,ArrayList<Integer>arr) {
        if(target==0){
            ans.add(new ArrayList<>(arr));
            return;
        }

        if(index == nums.length || target < 0){
    return;
}

        helper(nums,target,index+1,arr);
        //taken
        // if(index<nums.length)
        // {
            arr.add(nums[index]);
        helper(nums,target-nums[index],index,arr);
        arr.remove(arr.size()-1);
        // }


        return ;
    }
    
}
