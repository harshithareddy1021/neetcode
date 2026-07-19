class MinStack {
    private Stack<Integer> s;
    
    public MinStack() {
        s=new Stack<>();
        

        
    }
    
    public void push(int val) {
        s.push(val);
      
        
    }
    
    public void pop() {
        s.pop();
       
    }
    
    public int top() {
        return s.peek();
       
    }
    
    public int getMin() {
        int min=s.pop();
        Stack<Integer> temp=new Stack<>();
        temp.push(min);
        while(!s.isEmpty()){
            int t =s.pop();
            min=Math.min(min,t);
            temp.push(t);
        }
        while(!temp.isEmpty()){
            s.push(temp.pop());
        }
        return min;
        
        
    }
}
