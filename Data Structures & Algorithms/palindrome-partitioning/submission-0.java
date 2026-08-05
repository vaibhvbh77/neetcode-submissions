class Solution {
    List<List<String>>list;
    public List<List<String>> partition(String s) {
        list=new ArrayList<>();
        solve(s,0,new ArrayList<>());
        return list;
        
    }
    public void solve(String s, int start,List<String>path){
        if(start==s.length()){
            list.add(new ArrayList<>(path));
        }
        for(int end=start;end<s.length();end++){
            String prefix=s.substring(start,end+1);
            if(isPalindrome(prefix)){
                path.add(prefix);
                solve(s,end+1,path);
                path.remove(path.size()-1);
            }
        }

    }
    public boolean isPalindrome(String str){
        int low=0;
        int high=str.length()-1;
        while(low<high){
            if(str.charAt(low)!=str.charAt(high))
            return false;
            low++;
            high--;
        }
        return true;
    }
}
