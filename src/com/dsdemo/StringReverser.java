package com.dsdemo;

import java.util.Stack;

public class StringReverser {
    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        StringBuffer reversedString = new StringBuffer();

        while (!stack.empty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }
}
