class Solution {
    public int reverseBits(int n) {
        int res=0;
        for(int i=0;i<=32;i++){
            int shifted=n>>i;
            int extractedBit=shifted&1;
            int value2=extractedBit << (31 - i);
            res=res|(value2);
        }
        return res;
    }
}
