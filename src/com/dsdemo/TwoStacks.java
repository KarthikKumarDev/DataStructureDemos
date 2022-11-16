package com.dsdemo;

public class TwoStacks {
    private int[] stack;
    private  int firstIndex;
    private  int secondIndex;

    public TwoStacks(int size){
        stack = new int[size];
        firstIndex = 0;
        secondIndex = size-1;
    }

    public void pushFirst(int value){
        if(firstIndex == secondIndex){
            throw new StackOverflowError();
        }
        stack[firstIndex++] = value;
    }

    public void pushSecond(int value){
        if(firstIndex -1 == secondIndex){
            throw new StackOverflowError();
        }
        stack[secondIndex--] = value;
    }

    public int popFirst(){
        if(firstIndex == 0){
            throw new IllegalStateException();
        }
        return stack[--firstIndex];
    }

    public int popSecond(){
        if(secondIndex == stack.length){
            throw new IllegalStateException();
        }
        return stack[++secondIndex];
    }

    public void print(){
        System.out.println("----Printing Stack 1-----");
        for(int i =0; i< firstIndex; i++){
            System.out.println(stack[i]);
        }
        System.out.println("--------------");

        System.out.println("----Printing Stack 2-----");
        for(int j =stack.length-1; j > secondIndex; j--){
            System.out.println(stack[j]);
        }
        System.out.println("--------------");
    }

    public boolean isEmptyFirst(){
        return firstIndex == 0;
    }

    public boolean isEmptySecond(){
        return secondIndex == stack.length-1;
    }

    public boolean isFullFirst(){
        return firstIndex >= secondIndex;
    }

    public boolean isFullSecond(){
        return firstIndex >= secondIndex;
    }
}
