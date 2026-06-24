class Solution {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer>stack=new ArrayDeque<>();
        int n=tokens.length;
        int res=0;
        for(int i=0;i<n;i++){
            String str=tokens[i];
            if(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/")){
                int op1=stack.pop();
                int op2=stack.pop();
                if(str.equals("+")){
                    res=op2+op1;
                }

                else if(str.equals("-")){
                    res=op2-op1;
                }

               else if(str.equals("*")){
                    res=op2*op1;
                }
                else{
                    res=op2/op1;
                }

                stack.push(res);

            }
            else{
                int element=Integer.parseInt(str);
                stack.push(element);
            }

            }
        return stack.pop();
        }
        
    }

