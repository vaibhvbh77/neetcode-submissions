class Solution {
    Boolean [][]dp;
    public boolean canPartition(int[] nums) {
        int sums=sum(nums);
        if(sums%2!=0) return false;
        int target=sums/2;
        dp=new Boolean[nums.length+1][target+1];
        return solve(nums,target,0);

    }
    public int sum(int []nums){
        int res=0;
        for(int i=0;i<nums.length;i++)
        res+=nums[i];
    return res;
    }
    public boolean solve(int []nums,int target,int index){
        if(target==0){
            return true;
        }
        if(target<0 || index>=nums.length){
            return false;
        }

        if(dp[index][target]!=null){
            return dp[index][target];
        }
        boolean pick=solve(nums,target-nums[index],index+1);
        boolean notPick=solve(nums,target,index+1);



        if(pick || notPick) {dp[index][target]= true;return true;}

                dp[index][target]= false;
                return false;

    }
}
