class Solution {
    public int reverse(int x) {
        long ans=0;
        int temp=x;
        while(temp!=0){
            int ld=temp%10;
            ans=ans*10+ld;
            temp=temp/10;
        }
        if(ans<=Integer.MAX_VALUE &&ans>=Integer.MIN_VALUE)
        return (int)ans;

        return 0;
    }
}
