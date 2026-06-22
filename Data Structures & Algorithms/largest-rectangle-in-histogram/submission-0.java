class Solution {
    public int largestRectangleArea(int[] heights) {
        int []preIndex=prevSmaller(heights,heights.length);
        int []nextIndex=nextSmaller(heights,heights.length);
        int res=0;
        for(int i=0;i<heights.length;i++){
            int width=nextIndex[i]-1-preIndex[i];
            int height=heights[i];
            int area=width*height;
            res=Math.max(area,res);

        }
        return res;

        
    }
    public int[] prevSmaller(int []arr,int n){
        int []ps=new int[n];
        ArrayDeque<Integer>stack=new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty()&&arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ps[i]=-1;
            }else{
                ps[i]=stack.peek();
            }
            stack.push(i);

        }
        return ps;


    }
    public int[] nextSmaller(int []arr,int n){
        int []next=new int[n];
        ArrayDeque<Integer>stack=new ArrayDeque<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty()&&arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                next[i]=n;
            }else{
                next[i]=stack.peek();
            }
            stack.push(i);

        }
        return next;


    }
}
