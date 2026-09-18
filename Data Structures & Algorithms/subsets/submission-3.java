class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
        res=new ArrayList<>();

         solve(nums,0,new ArrayList<>());
        return res;
    }
    public void solve(int []nums,int index,ArrayList<Integer>curr){

        if(index==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        solve(nums,index+1,curr);
        curr.remove(curr.size()-1);
        
        solve(nums,index+1,curr);

    }
}
