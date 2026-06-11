class Solution {
    public int[] countBits(int n) {
        int[]arr=new int[n+1];
        arr[0]=0;
        for(int i=1;i<=n;i++){
            arr[i]=count1(i);
        }
        return arr;
    }
    public int count1(int n){
        int res=0;
        while(n!=0){
            n=n&(n-1);
            res++;
        }
        return res;
    }
}
