package com.ash.inflearn.stack;

import java.util.Stack;
import java.util.stream.Collectors;

/**
 * 2. 괄호문자제거
 */
public class StackQ2 {

    public String solution(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c != ')') stack.push(c);
            else {
                while (stack.pop() != '(');
            }
        }

        return stack.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
