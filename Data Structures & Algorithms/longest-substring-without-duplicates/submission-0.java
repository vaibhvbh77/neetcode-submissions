class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        HashSet<Character> set = new HashSet<>();
        int left=0;
        int right=0;
        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                ans=Math.max(right-left+1,ans);
                right++;
            }
            else{
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
            }

  
        }
        return ans;
        
    }
}
