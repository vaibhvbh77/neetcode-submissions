class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int high=s1.length()-1;
        
        for(int i=0;i<=s2.length()-s1.length();i++){
            if(checker(s2.substring(i,high+1),s1)){
                return true;
            }
            high++;
        }

        return false;

        
    }
    public boolean checker(String s1,String s2){
       int[]freq=new int[26];
       for(int i=0;i<s1.length();i++){
        freq[s1.charAt(i)-'a']++;
        freq[s2.charAt(i)-'a']--;
       }

    for(int i=0;i<26;i++){
        if(freq[i]!=0)
        return false;
       }
    return true;
    }
}
