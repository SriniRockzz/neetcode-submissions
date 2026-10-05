class MinStack {
 Stack<Integer> df;
 Stack<Integer> dfs;

        int min;

    public MinStack() {
       df = new Stack<>();
       dfs = new Stack<>();

    }
    
    public void push(int val) {
               if(df.isEmpty())
        {
            min = val;
        }
        df.push(val);

     if(min>val)
        {
            min = val;
        }
        else if(!dfs.isEmpty())
        {
            min = dfs.peek();
        }
        dfs.push(min);
    }
    
    public void pop() {
        df.pop();
        dfs.pop();

    }
    
    public int top() {
        return df.peek();
    }
    
    public int getMin() {
        return dfs.peek();
    }
}
