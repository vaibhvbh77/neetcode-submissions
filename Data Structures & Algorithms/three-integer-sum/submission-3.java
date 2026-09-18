class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<=nums.length-3;i++){
            int low=i+1;
            int high=nums.length-1;
            int fixed=i;
            if(i > 0 && nums[i] == nums[i - 1])
            continue;
            
            while(low<high){
                int sum=nums[low]+nums[high]+nums[fixed];
                if(sum==0){
                    ArrayList<Integer>list=new ArrayList<>();
                    list.add(nums[high]);
                    list.add(nums[low]);
                    list.add(nums[fixed]);

                    ans.add(list);
                
                    low++;
                    high--;

                    while(low<high &&nums[low]==nums[low-1]) low++;
                    while(low<high &&nums[high]==nums[high+1]) high--;


                }
                else if(sum>0) high--;

                else low++;
            }

        }

        return ans;
    }
}
