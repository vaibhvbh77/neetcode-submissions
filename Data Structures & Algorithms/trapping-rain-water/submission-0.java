class Solution {
    public int trap(int[] heights) {
        int lmax[]=new int[heights.length];
        int rmax[]=new int[heights.length];
        int ans=0;
        lmax[0]=heights[0];
        for(int i=1;i<heights.length;i++){
            lmax[i]=Math.max(heights[i],lmax[i-1]);
        }

         rmax[heights.length-1]=heights[heights.length-1];
        for(int i=heights.length-2;i>=0;i--){
            rmax[i]=Math.max(heights[i],rmax[i+1]);
        }

        for(int i=0;i<heights.length;i++){
            ans= ans+Math.min(lmax[i],rmax[i])-heights[i];
        }
        return ans;

    }
}
