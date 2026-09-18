class Solution {

    public String encode(List<String> strs) {
        String encodedString="";
        for(int i=0;i<strs.size();i++){
            String current=strs.get(i);
            int length=current.length();
            encodedString=encodedString+length+"#"+current;

        }
        return encodedString;
    }

    public List<String> decode(String str) {
        List<String>list=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            String stringNumber="";
            while(str.charAt(i)>='0' && str.charAt(i)<='9'){
                stringNumber=stringNumber+str.charAt(i);
                i++;
            }
            i++;
            int size=Integer.parseInt(stringNumber);
            // number 
            String value="";
            for(int j=0;j<size;j++){
                value=value+str.charAt(i);
                i++;
            }
            list.add(value);
        }

        return  list;
    }
}
