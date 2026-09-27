class MinStack {
    Stack<Integer> stk;
    Stack<Integer> dup;
    public MinStack() {
        stk = new Stack<>();
        dup = new Stack<>();
    }
    
    public void push(int val) {
        stk.push(val);
        if(dup.isEmpty())
            dup.push(val);
        else
            dup.push(Math.min(val,dup.peek()));
    }
    
    public void pop() {
        if(!stk.isEmpty()){
        stk.pop();
        dup.pop();
        }
    }
    
    public int top() {
        if(!stk.isEmpty())
            return stk.peek();
        return -1;
    }
    
    public int getMin() {
        int mn = Integer.MAX_VALUE;
        if(!dup.isEmpty()){
            return dup.peek();
        }
       return -1;
    }
}
