class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                    continue;}
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int target=-nums[i];
                if(nums[j]+nums[k]==target){
                    
                    ArrayList<Integer>list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);
                    j++;
                    k--;



    // Skip duplicate values of j

    while(j < k && nums[j] == nums[j-1]){

        j++;

    }

    // Skip duplicate values of k

    while(j < k && nums[k] == nums[k+1]){

        k--;

    }
                }
                else if(target>nums[j]+nums[k]){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return ans;

    }
}
