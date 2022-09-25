package multi_file_problems.ImplementQueueUsingStacks;

public class ImplementQueueUsingStacks {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();

        int x = 0;

        obj.push(x++);
        obj.push(x++);
        obj.push(x++);
        obj.push(x++);
        obj.push(x++);
        obj.push(x++);
        obj.push(x++);

        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();

        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }
}
