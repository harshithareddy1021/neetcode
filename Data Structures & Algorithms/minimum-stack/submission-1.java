class MinStack {
    Stack<Integer> s=new Stack();
    Stack<Integer> m=new Stack();

    public MinStack() {
       
        
    }
    
    public void push(int val) {
        s.push(val);
        if(!m.isEmpty()&&m.peek()<val)m.push(m.peek());
        else m.push(val);
        
    }
    
    public void pop() {
        s.pop();
        m.pop();
        
    }
    
    public int top() {
        return s.peek();
        
    }
    
    public int getMin() {
        return m.peek();

        
    }
}
