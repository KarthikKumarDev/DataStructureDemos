package com.dsdemo;

public class Main {
    public static void main(String[] names) {
        Array numbers = new Array(2);
        numbers.insert(1);
        numbers.insert(3);
        numbers.insert(4);
        numbers.print();
        System.out.println("-----");
        numbers.removeAt(0);
        numbers.insert(5);
        numbers.print();
    }
}
