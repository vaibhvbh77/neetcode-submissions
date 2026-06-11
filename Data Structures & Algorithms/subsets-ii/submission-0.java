class Solution {
        List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         Arrays.sort(nums);

        helper(nums, 0, new ArrayList<Integer>());

        return ans;
        
    }
    public void helper(int[] arr,int index,ArrayList<Integer> curr){
        ans.add(new ArrayList<>(curr));

        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]){
                continue;
            }
            curr.add(arr[i]);
            helper(arr,i+1,curr);
            curr.remove(curr.size()-1);

        }

        return;
    }
}
