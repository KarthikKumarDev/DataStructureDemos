package com.dsdemo;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void resizeArray(int delta) {
        int[] bufferArray = new int[items.length + (delta)];

        for (int i = 0; i < count; i++) {
            bufferArray[i] = items[i];
        }

        items = bufferArray;
    }

    public void insert(int value) {
        // if the array is full
        if (count >= items.length) {
            resizeArray(1);
        }

        // Add the element at the end of the array
        items[count++] = value;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        for (int i = index; i < count - 1; i++) {
            items[i] = items[i + 1];
        }
        count--;
        resizeArray(-1);
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (item == items[i]) {
                return i;
            }
        }

        return -1;
    }

    public int max() {
        int max = 0;
        for (int i = 0; i < count; i++) {
            if (items[i] > max) {
                max = items[i];
            }
        }
        return max;
    }

    public Array intersect(Array second) {
        var intersection = new Array(count);

        for (int item : items)
            if (second.indexOf(item) >= 0)
                intersection.insert(item);

        return intersection;
    }

    public void reverse(){
        int[] reversed = new int[count];

        for (int i =0; i < count; i++){
            reversed[count-i-1] = items[i];
        }

        items = reversed;
    }
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
