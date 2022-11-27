class CustomStack {
    int [] stack;
    int size;
    int top = -1;
    public CustomStack(int maxSize) {
        this.size = maxSize;
        this.stack = new int[maxSize];
    }
    
    public void push(int x) {
        if(top+1 == size)
            return;
        stack[++top] = x;
    }
    
    public int pop() {
        if(top == -1)
            return -1;
        return stack[top--];
    }
    
    public void increment(int k, int val) {
        for(int i = 0; i< k && i <= top ;i++){
            stack[i]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */