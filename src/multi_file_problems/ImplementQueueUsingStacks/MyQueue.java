package multi_file_problems.ImplementQueueUsingStacks;

import java.util.Stack;

public class MyQueue {

    private Stack<Integer> mainStack;
    private Stack<Integer> helperStack;

    public MyQueue() {
        mainStack = new Stack<>();
        helperStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);
    }

    public int pop() {
        while(!mainStack.isEmpty()){
            helperStack.push(mainStack.pop());
        }
        int x = helperStack.pop();
        rebuildMainStack();
        return x;
    }

    public int peek() {
        while(!mainStack.isEmpty()){
            helperStack.push(mainStack.pop());
        }
        int x = helperStack.peek();
        rebuildMainStack();
        return x;
    }

    public boolean empty() {
        return mainStack.isEmpty();
    }

    private void rebuildMainStack(){
        while(!helperStack.isEmpty()){
            mainStack.push(helperStack.pop());
        }
    }
}
