package com.dsdemo;

public class Stack {
    private int[] stack;
    private int currentIndex;

    public Stack(int size){
        stack = new int[size];
        currentIndex = 0;
    }

    public void push(int value){
        if(currentIndex == stack.length){
            throw new StackOverflowError();
        }
        stack[currentIndex++] = value;
    }

    public int pop(){
        if(currentIndex == 0){
            throw new IllegalStateException();
        }
        return stack[--currentIndex];
    }

    public void print(){
        System.out.println("----Printing-----");
        for(int i =0; i< currentIndex; i++){
            System.out.println(stack[i]);
        }
        System.out.println("--------------");
    }

    public void peek(){
        if(currentIndex == 0){
            throw new IllegalStateException();
        }
        System.out.println("----Peeking-----");
        System.out.println(stack[currentIndex-1]);
        System.out.println("-------------");
    }

    public boolean isEmpty(){
        return currentIndex == 0;
    }
}
