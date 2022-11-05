package com.dsdemo;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Arrays;
//import java.util.LinkedList;

public class Main {
    public static void main(String[] names) {
        // arrayOPS();
        linkedList();
    }

    public static void arrayOPS() {
        Array numbers = new Array(2);
        numbers.insert(1);
        numbers.insert(3);
        numbers.insert(4);
        numbers.print();

        System.out.println("-----");

        numbers.removeAt(0);
        numbers.insert(5);
        numbers.print();

        System.out.println("-----");

        System.out.println(numbers.indexOf(5));
        System.out.println(numbers.indexOf(100));

        System.out.println("-----");

        // Vector: Grows by 100% everytime - It is also synchronised
        // ArrayList: Grows by 50% everytime

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.size());

        list.remove(2);
        System.out.println(list);

        System.out.println("-----");

        // Exercise 1
        System.out.println("Max is " + numbers.max());

        System.out.println("-----");

        // Exercise 2 Intersection
        Array second = new Array(2);
        second.insert(3);
        second.insert(6);

        Array intersection = numbers.intersect(second);

        System.out.printf("Intersection: ");
        intersection.print();

        System.out.println("-----");

        // Exercise 3 Reverse

        numbers.print();
        numbers.reverse();
        System.out.println("<>");
        numbers.print();

        System.out.println("-----");

        // Exercise 4 insertAt
        numbers.insertAt(10, 1);
        numbers.insertAt(11, 1);
        System.out.println("Inserted at:");
        numbers.print();
    }

    public static void linkedList() {
//        LinkedList llist = new LinkedList();
//        llist.add(10);
//        llist.add(20);
//        llist.add(30);
//
//        System.out.println(llist);
//        System.out.println(llist.contains(10));
//        System.out.println(llist.indexOf(20));
//        System.out.println(llist.size());
//
//        var array= llist.toArray();
//        System.out.println(Arrays.toString(array));

        var llist = new LinkedList();
        llist.addLast(10);
        llist.addLast(20);
        llist.addLast(30);

        llist.print();

        System.out.println("-----");

        llist.addFirst(100);
        llist.print();

        System.out.println("-----");

        System.out.println("IndexOf: 10 and 200 ");
        System.out.println(llist.indexOf(10));
        System.out.println(llist.indexOf(200));

        System.out.println("-----");

        System.out.println("Contains: 10 and 200 ");
        System.out.println(llist.contains(10));
        System.out.println(llist.contains(200));

        System.out.println("-----");
        llist.print();

        System.out.println("Remove First");
        llist.removeFirst();
        llist.print();

        System.out.println("-----");
        llist.print();

        System.out.println("Remove Last");
        llist.removeLast();
        llist.print();

        System.out.println("-----");
        System.out.println("Size of LinkedList");
        System.out.println(llist.size());

        System.out.println("-----");
        System.out.println("To Array");
        System.out.println(Arrays.toString(llist.toArray()));

        System.out.println("-----");
        System.out.println("Reverse Linked List");

        llist.addLast(30);
        llist.addLast(40);
        llist.reverse();
        llist.print();

        System.out.println("-----");
        System.out.println("Find Kth Node from end");
        System.out.println(llist.findKthNodeFromEnd(3));
        System.out.println(llist.findKthNodeFromEnd(-2));
    }
}
