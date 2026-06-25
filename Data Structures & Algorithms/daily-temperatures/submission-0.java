class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] nextGreater;
        int n=temperatures.length;
        int []res=new int[n];
        nextGreater=nextGreater(temperatures);
        for(int i=0;i<n;i++){
            if(nextGreater[i]==-1){
                res[i]=0;
            }
            else{
                res[i]=nextGreater[i]-i;
            }
        }
        return res;

    }
    public int[] nextGreater(int  []arr){
        int n=arr.length;
        int []res=new int[n];
        ArrayDeque<Integer>stack=new ArrayDeque<Integer>();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty()&&arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i]=-1;
            }
            else if(stack.isEmpty()==false){
                res[i]=stack.peek();
            }
            stack.push(i);
        }
        return res;
    }
}
