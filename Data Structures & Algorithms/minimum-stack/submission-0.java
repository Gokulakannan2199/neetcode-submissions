class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        this.stack = new Stack<Integer>();
        this.minStack = new Stack<Integer>();
    }
    
    public void push(int val) {
        this.stack.push(val);
        if(this.minStack.isEmpty()) this.minStack.push(val);
        else this.minStack.push(Math.min(val, this.minStack.peek()));
    }
    
    public void pop() {
        if(!this.minStack.isEmpty())
            this.minStack.pop();
        this.stack.pop();

    }
    
    public int top() {
        return this.stack.peek();
    }
    
    public int getMin() {
        return this.minStack.peek();
    }
}
