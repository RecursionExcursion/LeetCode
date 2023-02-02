package com.rloup.leetcode.multi_file_problems.ImplementStackUsingQueues;

public class ImplementStackUsingQueues {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        int x = 0;

        obj.push(x++); //0
        obj.push(x++); //1
        obj.push(x++); //2
        obj.push(x++); //3
        obj.push(x++); //4
        obj.push(x++); //5

        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();

        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }
}
