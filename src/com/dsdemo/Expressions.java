package com.dsdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expressions {
    private final String expression;
    private final List<Character> leftBrackets = Arrays.asList('(', '<', '{','[');
    private final List<Character> rightBrackets = Arrays.asList(')', '>', '}',']');

    public Expressions(String input) {
        this.expression = input;
    }

    public void print(){
        System.out.println(this.expression);
    }

    public boolean isBalanced() {
        if (this.expression == null) {
            throw new NullPointerException();
        }
        Stack<Character> stack = new Stack<>();

        for (char ch : this.expression.toCharArray()) {
            if (isOpenBracket(ch)) {
                stack.push(ch);
            }
            if (isCloseBracket(ch)) {
                if (stack.empty()) {
                    return false;
                }
                var top = stack.pop();

                if (!matchingBrackets(top, ch)) {
                    return false;
                }

            }
        }

        return stack.isEmpty();
    }

    private boolean isOpenBracket(char ch){
        return leftBrackets.contains(ch);
    }

    private boolean isCloseBracket(char ch){
        return rightBrackets.contains(ch);
    }

    private  boolean matchingBrackets(char open, char close){
        return leftBrackets.indexOf(open) == rightBrackets.indexOf(close);
    }
}
