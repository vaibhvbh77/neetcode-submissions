class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

   int slow = n;

        int fast = n;

        do {

            slow = next(slow);

            fast = next(next(fast));

        } while (slow != fast);

        return slow == 1;
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
