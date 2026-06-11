class Solution {
    List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        helper(nums,0);
        return ans;
    }
    public void helper(int [] nums,int index){
        if(index==nums.length){
            ArrayList<Integer>curr=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                curr.add(nums[i]);
            }
            ans.add(curr);
        }

        for(int i=index;i<nums.length;i++){
            swap(nums,index,i);
            helper(nums,index+1);
            swap(nums,index,i);

        }
        return;
    }
    



    public void swap(int[] arr,int i,int j){

        int temp=arr[i];

        arr[i]=arr[j];

        arr[j]=temp;

    }
}
