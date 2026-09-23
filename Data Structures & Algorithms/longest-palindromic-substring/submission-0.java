

class Solution {
    public String longestPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            // odd
           String ans1= pallindromeCount(s,i,i);
           if(ans1.length()>str.length()){
            str=ans1;
           }
            // even
             String ans2= pallindromeCount(s,i,i+1);
           if(ans2.length()>str.length()){
            str=ans2;
           }
        }
        return str;
    }
    public String pallindromeCount(String s,int left,int right){
        int count=0;
        while(left>=0 &&right<=s.length()-1 &&  s.charAt(left)==s.charAt(right)){
            left--;
            right++;
            count++;
        }
        return s.substring(left+1,right);
    }
}
