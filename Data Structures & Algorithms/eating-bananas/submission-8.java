class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
       int low=1;
       int high=max;
       int ans=Integer.MAX_VALUE;

       while(low<=high){
        int middle=low+(high-low)/2;
        boolean possible=totalTimeTaken(middle,piles,h);
            if (possible) {
                ans = Math.min(ans, middle);
                high = middle - 1;
            } else {
                low = middle + 1;
            }

       }
        return ans;
    }
    public boolean totalTimeTaken(int rate,int []piles,int limit){
        long time=0;
        for(int i=0;i<piles.length;i++){
            // time=time+int(Math.ceil(piles[i]/rate));
          time += (long) Math.ceil((double) piles[i] / rate);
        }

        return time<=limit;
    }
}
