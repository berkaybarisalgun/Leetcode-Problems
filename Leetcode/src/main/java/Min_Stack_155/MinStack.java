package Min_Stack_155;

import java.util.Stack;

class MinStack {
    private Stack<Integer> stack=new Stack<>();
    private Stack<Integer> minStack=new Stack<>();
    public MinStack() {
  stack=new Stack<>();
  minStack=new Stack<>();
    }

    public void push(int val) {
      stack.push(val);
      if(minStack.isEmpty()||val<=minStack.peek()){
        minStack.push(val);
      }
    }

    public void pop() {
      int pop = stack.pop();
  if(pop==minStack.peek()){
    minStack.pop();
  }
    }

    public int top() {
  return stack.peek();
    }

    public int getMin() {
  return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
