class Solution {
    int []dp;
    public int rob(int[] nums) {
        dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        int n=nums.length;
        dp[n]=0;
        dp[n-1]=nums[nums.length-1];

        for(int i=n-2;i>=0;i--){
            int pick=0;
            int notPick=0;
            pick=nums[i]+dp[i+2];
             notPick=dp[i+1];
             dp[i]=Math.max(pick,notPick);
        }

        return dp[0];
    }
}
