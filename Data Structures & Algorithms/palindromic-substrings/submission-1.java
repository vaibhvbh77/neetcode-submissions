class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            // odd
           count+= pallindromeCount(s,i,i);
            // even
            count+=pallindromeCount(s,i,i+1);
        }
        return count;
    }
    public int pallindromeCount(String s,int left,int right){
        int count=0;
        while(left>=0 &&right<=s.length()-1 &&  s.charAt(left)==s.charAt(right)){
            left--;
            right++;
            count++;
        }
        return count;
    }
}
