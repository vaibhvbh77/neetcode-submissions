class Solution {
    public int rob(int[] nums) {
        int n=nums.length;


    if(nums.length == 1)
        return nums[0];
        int dp1[]=new int[nums.length+1];
        int dp2[]=new int[nums.length+1];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);
        int res1=solve(nums,n-2,0,dp1);
        int res2=solve(nums,n-1,1,dp2);
        return Math.max(res1,res2);
        
    }
    public int solve(int[] nums,int n,int index,int []dp) {
        if(index>n){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int firstJump=solve(nums,n,index+1,dp);
        int secondJump=nums[index]+solve(nums,n,index+2,dp);
        
        dp[index]=Math.max(firstJump,secondJump);
        return dp[index];
        
    }
}
