class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer>open=new Stack<>();
        Stack<Integer>star=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open.push(i);
            }
            else if(s.charAt(i)=='*'){
                star.push(i);
            }
            // seeing a )
            else{
                if(!open.isEmpty()){
                    open.pop();
                }
                  else if(open.isEmpty() && star.isEmpty()){
                    return false;
                }
                else{
                    star.pop();
                }
            }

        }

        while(!open.isEmpty()){
            if(star.isEmpty()){
                return false;
            }
            int i=open.pop();
            int j=star.pop();

            if(i>j) return false;
        }
        return true;
        
    }
}
