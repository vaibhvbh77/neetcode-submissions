class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=maxElement(piles);
        int low=1;
        int high=max;
        int res=max;
        while(low<=high){
            int mid=(low+high)/2;
            int totaltime = 0;
            for(int j=0;j<piles.length;j++){
                totaltime+=(int)Math.ceil((double)piles[j]/mid);
            }

            if(totaltime<=h){
                res=Math.min(res,mid);
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return res;


    }
    public int maxElement(int []arr){
        int res=arr[0];
        for(int i=0;i<arr.length;i++){
            res=Math.max(res,arr[i]);
        }
        return res;
    }
}
