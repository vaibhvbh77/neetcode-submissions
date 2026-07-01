class Solution {
    public int maxProduct(int[] nums) {
        int minEnding=nums[0];
        int maxEnding=nums[0];
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
        int prevMax = maxEnding;
        int prevMin = minEnding;

        maxEnding=Math.max(prevMax*nums[i],Math.max(nums[i],prevMin*nums[i]));
        minEnding=Math.min(prevMin*nums[i],Math.min(nums[i],prevMax*nums[i]));
        ans=Math.max(maxEnding,ans);

        }

        return ans;
    }

}
