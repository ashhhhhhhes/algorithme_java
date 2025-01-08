package com.ash.inflearn.stack;

import java.util.Stack;

/**
 * 1. 올바른 괄호
 */
public class StackQ1 {

    public String solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (c == '(') stack.push(c);
            else if (stack.isEmpty()) return "NO";
            else stack.pop();
        }

        return "YES";
    }
}
