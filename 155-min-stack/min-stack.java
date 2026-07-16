class MinStack {
    Stack<Integer> minStack;
    Stack<Integer> mainStack;

    public MinStack() {
        minStack = new Stack<>();
        mainStack = new Stack<>();
    }
    
    public void push(int value) {
        mainStack.push(value);
        if(minStack.isEmpty() || value <= minStack.peek()){
            minStack.push(value);
        }
    }
    
    public void pop() {
        if(mainStack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        mainStack.pop();
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
