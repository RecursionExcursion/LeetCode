package multi_file_problems.ImplementStackUsingQueues;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

    private Queue<Integer> q1;
    private Queue<Integer> q2;


    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {

        while (!q1.isEmpty()) {
            int num = q1.remove();
            if (q1.isEmpty()) {
                refillQ1();
                return num;
            }
            q2.add(num);
        }
        return -1;
    }

    public int top() {
        while (!q1.isEmpty()) {
            int num = q1.remove();
            q2.add(num);
            if (q1.isEmpty()) {
                refillQ1();
                return num;
            }
        }
        return -1;
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public void refillQ1() {
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
    }
}
