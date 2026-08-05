class Solution {
    List<String>list;
    public List<String> generateParenthesis(int n) {
        list=new ArrayList<>();
        solve(0,0,"",n);
        return list;
        
    }
    public void solve(int closed,int open,String str,int n){
        if(closed==n && open ==n){
            list.add(str);
            return;
        }
        if(open<n){
            // 2 options 
            // (( or ()
            solve(closed,open+1,str+"(",n);
        }
         if(closed<open){
            // 1 option 
            // )
            solve(closed+1,open,str+")",n);
        }
    }
}
