class Solution {
    public int largestRectangleArea(int[] heights) {
        int []ps=new int[heights.length];
        int []ns=new int[heights.length];
        previousSmaller(ps,heights);
        nextSmaller(ns,heights);
        int maxArea=0;

        for(int i=0;i<heights.length;i++){
            int width=ns[i]-ps[i]-1;
            maxArea=Math.max(width*heights[i],maxArea);
        }

        return maxArea;

        
    }
  public void previousSmaller(
            int[] ps, int[] heights) {

        Stack<Integer> stack = new Stack<>();

        stack.push(0);
        ps[0] = -1;

        for(int i = 1; i < heights.length; i++) {

            while(!stack.isEmpty() &&
                  heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                ps[i] = -1;
            }
            else {
                ps[i] = stack.peek();
            }

            stack.push(i);
        }
    }

    public void nextSmaller(
            int[] ns, int[] heights) {

        Stack<Integer> stack = new Stack<>();

        int n = heights.length;

        stack.push(n - 1);
        ns[n - 1] = n;

        for(int i = n - 2; i >= 0; i--) {

            while(!stack.isEmpty() &&
                  heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                ns[i] = n;
            }
            else {
                ns[i] = stack.peek();
            }

            stack.push(i);
        }
    }
}