class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        helper(nums,target,0,new ArrayList<>());
        return ans;
    }
    public void helper(int[] nums, int target,int index,ArrayList<Integer>arr) {
        if(target==0){
            ans.add(new ArrayList<>(arr));
            return;
        }

        if( target < 0)
    return;

    for(int i=index;i<nums.length;i++){
        if(i>index&&nums[i]==nums[i-1]){
            continue;
        }
            arr.add(nums[i]);
        helper(nums,target-nums[i],i,arr);
        arr.remove(arr.size()-1);
    
}



     


        return ;
    }
    
}
