class Solution {
    int []dp;
    public int numDecodings(String s) {
        dp=new int[s.length()];
        Arrays.fill(dp,-1);

        return solve(0,s.length(),s);
    }
    public int solve(int index,int length,String s){
        if(length==index) return 1;
        if(s.charAt(index)=='0') return 0;

        int oneStep=0;
        int twoStep=0;

        if(dp[index]!=-1) return dp[index];

        oneStep=solve(index+1,length,s);
        if(index+2<=length){
            String str=s.substring(index,index+2);
            int num=Integer.parseInt(str);

            if(num<=26 && num!=0)
            twoStep=solve(index+2,length,s);
        }

        int total=oneStep+twoStep;
        dp[index]=total;

        return total;

    }
}
