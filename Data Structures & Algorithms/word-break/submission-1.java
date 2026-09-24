class Solution {
    Boolean[] dp;
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String>set=new HashSet<>(wordDict);
         dp=new Boolean[s.length()+1];
        return solve(s,0,set);
    }
    public boolean solve(String s,int index,HashSet<String> set){
        if(index==s.length()){
            return true;
        }

        if(dp[index]!=null) return dp[index];

        for(int i=index;i<s.length();i++){
            String current=s.substring(index,i+1);
            if(set.contains(current)){
                boolean leftOver=solve(s,i+1,set);
                if(leftOver){
                    dp[index]= true;
                    return true;
                }
            }
        }
        dp[index]= false;
        return false;
    }
}
