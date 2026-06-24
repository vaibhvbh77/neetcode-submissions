class Solution {
    public boolean isPalindrome(String s) {
        String str=s.trim();

        //remove speical character 
        int low=0;
        int high=str.length()-1;
        while(low<=high){
        char a = str.charAt(low);
        char b = str.charAt(high);

while(low<high&& !Character.isLetterOrDigit(a)){
    low++;
    a=str.charAt(low);
}


while(low<high&&!Character.isLetterOrDigit(b)){
    high--;
    b=str.charAt(high);
}

            if(Character.toLowerCase(a) == Character.toLowerCase(b)){
                low++;
                high--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
