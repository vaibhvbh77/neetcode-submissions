class Solution {
    int dp[][];
    public int longestCommonSubsequence(String text1, String text2) {
        dp=new int[text1.length()+1][text2.length()+1];
        for(int i=0;i<=text1.length();i++)
        Arrays.fill(dp[i],-1);

        return solve(text1,text2,text1.length(),text2.length());
    }
    public int solve(String text1,String text2,int n,int m){
        if(n==0 || m==0)return 0;
        if(dp[n][m]!=-1) return dp[n][m];
        if(text1.charAt(n-1)==text2.charAt(m-1)){
            dp[n][m]=1+solve(text1,text2,n-1,m-1);
            return dp[n][m];
        }
        else{
            dp[n][m]=Math.max(solve(text1,text2,n-1,m),solve(text1,text2,n,m-1));
            return dp[n][m];
        }
    }
}
