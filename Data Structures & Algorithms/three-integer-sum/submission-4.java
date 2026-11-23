class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int target=-nums[i];
            int low=i+1;
            int high=nums.length-1;
            if (i > 0 && nums[i] == nums[i - 1]) {
    continue;
}
            while(low<high ){
                int mid=nums[low]+nums[high];
                if(mid==target){
                    list.add(Arrays.asList(nums[i],nums[low], nums[high]));
                    low++;
                    high--;
                    while (low < high && nums[low] == nums[low - 1]) {
    low++;
}
while (low < high && nums[high] == nums[high + 1]) {
    high--;
}
                }
                else if(mid>target){
                    high--;
                }
                else{
                    low++;
                }
            }
        }


        return list;
    }
}
