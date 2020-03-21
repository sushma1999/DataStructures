package com.Sushma;

import java.util.Queue;

public class Maain {
    public static void main(String[] args) {
        QueueWithTwoStacks queue =new QueueWithTwoStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        var first =queue.dequeue();
        System.out.println(first);
    }
}
