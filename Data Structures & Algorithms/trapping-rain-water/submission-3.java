class Solution {
    public int trap(int[] height) {
        int water=0;

        int []pg=new int[height.length];
        int []ng=new int[height.length];

        int max=height[0];

        for(int i=0;i<height.length;i++){
            max=Math.max(max,height[i]);
            pg[i]=max;
        }

        max=height[height.length-1];
        for(int i=height.length-1;i>=0;i--){
            max=Math.max(max,height[i]);
            ng[i]=max;
        }


         for(int i=0;i<height.length;i++){
            int tall=Math.min(pg[i],ng[i]);
            water=water+(tall)-height[i];
        }

        

        return water;
    }
}
