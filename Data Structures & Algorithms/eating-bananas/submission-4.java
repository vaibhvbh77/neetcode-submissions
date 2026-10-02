class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ans=Integer.MAX_VALUE;
        int low=1;
        int high=0;
        for(int i=0;i<piles.length;i++)
        high=Math.max(high,piles[i]);


        while(low<=high){
            int k=low+(high-low)/2;
            if(canEat(k,piles,h)){
                ans=Math.min(k,ans);
                high=k-1;
            }
            else{
                low=k+1;
            }
        }

        return ans;

        
    }
    public boolean canEat(int k,int []piles,int h){
        int timeToEat=0;
        for(int i=0;i<piles.length;i++){

     timeToEat += Math.ceil(
            (double) piles[i] / k
        );
        }

        if(h<timeToEat) return false;
        return true;


    }
}
