package com.dsdemo;

public class Array {
    private int[] items;
    private int count;

    public Array(int length){
        items = new int[length];
    }

    public void resizeArray(){
        int[] bufferArray = new int[items.length + 1];

        for(int i = 0; i< count; i++){
            bufferArray[i] = items[i];
        }

        items = bufferArray;
    }

    public void insert(int value){
        // if the array is full
        if(count>= items.length){
            resizeArray();
        }

        // Add the element at the end of the array
        items[count++] = value;
    }

    public void print(){
        for(int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }
}
