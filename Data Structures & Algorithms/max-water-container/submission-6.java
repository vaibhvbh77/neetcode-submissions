class Solution {
    public int maxArea(int[] heights) {
        int max=Integer.MIN_VALUE;
        int low=0;
        int high=heights.length-1;
        while(low<high){
            int height=Math.min(heights[low],heights[high]);
            int width=high-low;
            max=Math.max(height*width,max);         
            if(heights[low] >heights[high]){
                high--;
            }
            else{
                low++;
            }
        }


        return max;
        
    }
}
