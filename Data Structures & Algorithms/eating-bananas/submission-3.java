class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int right=0;
        for(int i:piles)
        right=Math.max(i,right);
        while(low<=right){
            int middle=low+(right-low)/2;
            int hours=0;
            for(int pile:piles){
                hours=hours+(pile+middle-1)/middle;
            }

            if(hours<=h){
                right=middle-1;
            }
            // too slow speed
            else low=middle+1;
        }
        return low;
    }

}
