package com.dsdemo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] names) {
        arrayOPS();
    }

    public static void arrayOPS(){
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

    }
}
