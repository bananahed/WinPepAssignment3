package com.Assignment3;
import java.util.*;
public class StackWithQueue {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    public void push(int data) {
        q1.add(data);
    }

    public int pop() {
        if(q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        while(q1.size() > 1) {
            q2.add(q1.remove());
        }

        int temp = q1.remove();

        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;

        return temp;
    }

    public static void main(String[] args) {
        StackWithQueue st = new StackWithQueue();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

    }
}
