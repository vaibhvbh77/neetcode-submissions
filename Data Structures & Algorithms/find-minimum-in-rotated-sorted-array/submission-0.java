class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int min=Integer.MAX_VALUE;
        int high=nums.length-1;

        while(low<=high){
        if(nums[low]<=nums[high])  min = Math.min(min, nums[low]);;
            int mid=(int)Math.floor((low+high)/2);
            //left half is sorted
          if (nums[low] <= nums[mid]) {
                min = Math.min(min, nums[low]);   // smallest of left half
                low = mid + 1;                    // search right half
            }
            // Right half is sorted
            else {
                min = Math.min(min, nums[mid]);   // smallest of right half
                high = mid - 1;                   // search left half
            }
        }
        return min;
    }
}
