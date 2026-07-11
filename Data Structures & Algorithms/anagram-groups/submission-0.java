class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       return solve(strs);
    }
    public List<List<String>> solve(String[]strs){
        HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> ans=new ArrayList<>();
        for(String s:strs){
            //frequency
            int []arr=new int[26];
            for(int i=0;i<s.length();i++){
                arr[s.charAt(i)-'a']++;
            }
            String key="";
            for(int i=0;i<arr.length;i++){
                key=key+arr[i]+"#";
            }
            if(map.containsKey(key)==false){
                map.put(key,new ArrayList<String>());
            }
            map.get(key).add(s);

        }

         return new ArrayList<>(map.values());


    }
}
