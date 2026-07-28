class Solution {
    public int maxArea(int[] heights) {
        int res=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                int width=j-i;
                int height=Math.min(heights[i],heights[j]);
                int area=height*width;
                res=Math.max(area,res);
            }
        }
        return res;
    }
}
