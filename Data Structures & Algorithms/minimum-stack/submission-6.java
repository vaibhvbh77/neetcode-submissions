class MinStack {
        ArrayDeque<Long>stack;
        Long min;

    public MinStack() {
       stack =new ArrayDeque<>();

    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push((long)val);
            min=(long)val;
        }
        else if(min>=val){
            stack.push(2L*val-min);
            min=(long)val;
        }
        else{
            stack.push((long)val);
        }
    }
    
    public void pop() {
        long res=stack.pop();
         if(res<min){
            long encodedValue= 2*min-res;
            min=encodedValue;
        }
    }
    
    public int top() {
        if(stack.peek()<min){
            return min.intValue();
        }
        return stack.peek().intValue();
    }
    
    public int getMin() {
        return min.intValue();
    }
}
