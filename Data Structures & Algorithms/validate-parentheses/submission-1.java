class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character>str=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
            str.push(s.charAt(i));
           }
           else{
            if(str.isEmpty()==false &&matching(str.peek(),s.charAt(i))){
                str.pop();
            }
            else{
                return false;
            }
           }
        }
        return str.isEmpty();

        
    }
    public boolean matching(char a, char b){
        if(a=='(' && b==')'||a=='{' && b=='}'||a=='[' && b==']'){
            return true;
        }
        return false;

    }
}
