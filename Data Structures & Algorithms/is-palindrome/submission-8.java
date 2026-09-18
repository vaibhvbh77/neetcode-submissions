class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            int value=s.charAt(i);
            if((value>='A' && value<='Z')||(value>='a' && value<='z')||(value>='0' && value<='9'))
            {
               str=str+Character.toLowerCase(s.charAt(i));
            }

        }
        return palindromeCheck(str);
    }
    public boolean palindromeCheck(String a){

        int low=0;
        int high=a.length()-1;

        while(low<high){
            if(a.charAt(low)==a.charAt(high)){
                low++;
                high--;
            }
            else return false;
        }
        return true;
    }
}
