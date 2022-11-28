package com.dsdemo;

public class Queue {
    private int[] queue;
    private int front;
    private int back;

    public Queue(int size) {
        queue = new int[size];
        front = back = 0;
    }

    public void enqueue(int value) {
        if(back == this.queue.length){
            throw new IllegalStateException();
        }
        this.queue[back++] = value;
    }

    public int dequeue() {
        return this.queue[front++];
    }

    public int peek() {
        return this.queue[front];
    }

    public boolean isEmpty(){
        return front == back;
    }

    public boolean isFull(){
        return back == this.queue.length;
    }

    public void print(){
        for(int i = front; i < back; i++){
            System.out.println(this.queue[i]);
        }
    }
}
