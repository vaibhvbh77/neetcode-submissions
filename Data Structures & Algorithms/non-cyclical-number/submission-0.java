class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1){
            if(set.contains(n)){
                return false;
            }
            else{
                set.add(n);
                n=next(n);
            }
        }
        return true;
    }
    public int next(int n){
        int res=0;
        while(n!=0){
            int lastDigit=n%10;
            n=n/10;
            res=res+(lastDigit*lastDigit);
        }
        return res;
    }
}
