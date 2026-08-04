class Solution {
    List<String>ans;
    public List<String> letterCombinations(String digits) {
        ans=new ArrayList<>();
         if (digits.length() == 0) {
        return ans;
    }
        solve(digits,0,"");
        
        return ans;
    }
    public void solve(String digits,int index,String str){
        if(index==digits.length()){
            ans.add(str);
            return;
        }
        else{
            String rotate=mapping(digits.charAt(index));
            for(int i=0;i<rotate.length();i++){
                solve(digits,index+1,str+rotate.charAt(i));
            }
        }

    }
    public String mapping(char a){
        if(a=='2'){
            return "abc";
        }
            if(a=='3'){
            return "def";
        }
            if(a=='4'){
            return "ghi";
        }
            if(a=='5'){
            return "jkl";
        }
            if(a=='6'){
            return "mno";
        }
            if(a=='7'){
            return "pqrs";
        }
            if(a=='8'){
            return "tuv";
        }
            if(a=='9'){
            return "wxyz";
        }
        else return "";
        
    }

}
