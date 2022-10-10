package com.dsdemo;

import java.util.NoSuchElementException;

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
    private int size;

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (first == null) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (first == null) {
            first = last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        size++;
    }

    public int indexOf(int value) {
        int index = 0;
        Node traverser = first;
        while (traverser != null) {
            if (traverser.value == value) {
                return index;
            }
            traverser = traverser.next;
            index++;
        }

        return -1;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    public void removeFirst() {
        if (first == null) {
            throw new NoSuchElementException();
        } else if (first == last) {
            first = last = null;
            size--;
        } else {
            Node second = first.next;
            first.next = null;
            first = second;
            size--;
        }
    }

    public Node getPrevious(Node node) {
        var current = first;

        while (current != null) {
            if (current.next == node) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void removeLast() {
        if (first == null) {
            throw new NoSuchElementException();
        } else if (first == last) {
            first = last = null;
            size--;
            return;
        } else {
            var previousNode = getPrevious(last);
            previousNode.next = null;
            last = previousNode;
            size--;
        }
    }

    public int size(){
        return size;
    }

    public void print() {
        Node traverser = first;

        while (traverser != null) {
            System.out.println(traverser.value);
            traverser = traverser.next;
        }
    }
}
