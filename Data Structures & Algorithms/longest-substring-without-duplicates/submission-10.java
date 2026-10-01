class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int high=0;
        int low=0;
        int size=0;
        while(high<s.length()){
        char current=s.charAt(high);
            while(set.isEmpty()==false &&set.contains(current)){
                set.remove(s.charAt(low));
                low++;
            }
            set.add(current);

            size = Math.max(size, high - low + 1);

            high++;

    }
            return size;
}
        
}
