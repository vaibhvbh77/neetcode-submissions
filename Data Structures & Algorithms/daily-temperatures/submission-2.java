class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>stack=new Stack<>();
        int size=temperatures.length;
        int []res=new int[size];
        stack.push(size-1);

        for(int i=size-2;i>=0;i--){
            int current=temperatures[i];
            while(stack.isEmpty()==false &&temperatures[stack.peek()]<=current)
            stack.pop();


            if(stack.isEmpty()){
                res[i]=0;
            }
            else{
                res[i]=stack.peek()-i;
            }
                stack.push(i);
        }
        return res;
        
    }
}
