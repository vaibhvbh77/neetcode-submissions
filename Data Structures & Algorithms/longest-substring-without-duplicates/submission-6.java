class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int answer=1;
        HashSet<Character>set=new HashSet<>();
        if(s.length()<=0) return 0;

        set.add(s.charAt(0));

        for(int high=1;high<s.length();high++){
            boolean contains=set.contains(s.charAt(high));
                if(contains==true){
                while(low<high && set.contains(s.charAt(high)))
                set.remove(s.charAt(low++));
            }
                set.add(s.charAt(high));
                answer=Math.max(answer,high-low+1);
        }
        return answer;
    }
}
