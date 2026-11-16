class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char current=s.charAt(i);

        if(current=='{' || current=='[' || current=='('){
                stack.push(current);
                }
        else{
            if(stack.isEmpty()){
                return false;
            }
                char out=stack.pop();
                if(isMatch(out,current)==false){
                    return false;
                }
            }
        }
        return stack.isEmpty();
        
    }
    public boolean isMatch(char a,char b){
        if((a=='{' &&b=='}') || (a=='[' &&b==']') || (a=='(' &&b==')'))
        return true;

        return false;
    }
}
