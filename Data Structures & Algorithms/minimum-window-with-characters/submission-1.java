class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }


        String ans="";
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();


        for(Character c:t.toCharArray())
        need.put(c,need.getOrDefault(c,0)+1);

        int low=0;
        int high=0;

        while(high<s.length()){
            char current =s.charAt(high);
            window.put(current,window.getOrDefault(current, 0) + 1);

            if(validWindow(need,window)){
                // updating my ans;
                while(validWindow(need,window)){
                // Update answer
                if (ans.equals("")
                        || high - low + 1 < ans.length()) {
 
                    ans = s.substring(low, high + 1);
                }

                //  remove left 
                char left = s.charAt(low);
                window.put(left, window.get(left) - 1);
                low++;

                }
            }
            high++;
        }
        return ans;

        
    }


    boolean validWindow(
        HashMap<Character, Integer> need,
        HashMap<Character, Integer> window ) {

        for (char c : need.keySet()) {

            if (window.getOrDefault(c, 0) < need.get(c)) {
                return false;
            }
        }

        return true;
    }
}
