package com.dsdemo;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int item) {
            value = item;
        }
    }

    private Node first;
    private Node last;

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (first == null) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public void print(){
        Node traverse = first;

        while (traverse != null){
            System.out.println(traverse.value);
            traverse = traverse.next;
        }
    }
}
