class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>(); 
        Integer result;
       
       for(String c : tokens )
       {

       if(c.equals("+")){
          result = add(stack);
          stack.push(result);
       } 
       else if(c.equals("-")){
          result = sub(stack);
          stack.push(result);
       } 
       else if(c.equals("*")){
          result = multiply(stack);
       stack.push(result);
       } 
            
        else  if(c.equals("/")){
          result = div(stack);
          stack.push(result);
       }
       else
       {
        stack.push(Integer.parseInt(c));
       }
       }

       return stack.pop(); 
    }

    public int add(Stack<Integer> a)
    {
        int res=  a.pop();
            res= res + a.pop();
        return res;
    }
        public int sub(Stack<Integer> a)
    {
        int res =  a.pop();
         res=  a.pop()- res;
        return res;
    }
        public int multiply(Stack<Integer> a)
    {
        int res=  a.pop();
        res= res * a.pop();
        return res;
    }
        public int div(Stack<Integer> a)
    {
        int res=  a.pop();
         res=  a.pop()/ res;
        return res;
    }
}
