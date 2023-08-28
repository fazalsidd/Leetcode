class MyStack {
    Queue<Integer> q = new LinkedList<>();
//     public void helper(Queue<Integer>q,int x)
//     {
        
//         if(q.isEmpty())
//         {
//             q.add(x);
//             return;
//         }
//         int n=q.poll();
//         helper(q,x);
//         q.add(n);
//     }

    public MyStack() {
    }
    
    public void push(int x) {
        Queue<Integer> temp = new LinkedList<>();
        while(!q.isEmpty())
        {
            temp.add(q.poll());
        }
        q.add(x);
        while(!temp.isEmpty())
        {
            q.add(temp.poll());
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */