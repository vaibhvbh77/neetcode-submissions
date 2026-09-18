class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int low=0;
        int high=heights.length-1;

        while(low<high){
            int height=Math.min(heights[low],heights[high]);
            int width=high-low;
            int area=height*width;
            max=Math.max(area,max);
            if(heights[low]<heights[high]){
                low++;
            }
            else{
                high--;
            }
        }

        return max;
    }
}
