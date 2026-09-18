class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String current=frequency(strs[i]);
            if(map.containsKey(current)){
                map.get(current).add(strs[i]);
            }
            else{
             List<String> list = new ArrayList<>(); // CHANGE
            list.add(strs[i]);                     // CHANGE
            map.put(current, list); 
            }

        }

            return new ArrayList<>(map.values());  
        
    }

    public String frequency(String s){
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }

        return Arrays.toString(freq);
    }
}
