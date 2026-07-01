class Solution {
    Boolean dp[][];
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0)
        return false;
        dp=new Boolean[nums.length+1][(sum/2)+1];
        return solve(nums,sum/2,nums.length-1);
    }

       public boolean solve(int[] nums,int sum,int index) {
        if(sum==0)return true;
        if(index==0)return false;

        if(dp[index][sum]!=null){
            return dp[index][sum];
        }

        if(sum>=nums[index-1]){
            boolean include=solve(nums,sum-nums[index-1],index-1);
            boolean exclude=solve(nums,sum,index-1);
            dp[index][sum]= include||exclude;
            return dp[index][sum];
        }
        else{
            dp[index][sum]=solve(nums,sum,index-1);
            return dp[index][sum];
        }
        
    }
}
