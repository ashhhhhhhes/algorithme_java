package com.ash.inflearn.stack;

import java.util.Stack;

/**
 * 4. 후위식 연산(postfix)
 */
public class StackQ4 {


    public int solution(String t) {
        Stack<Integer> stack = new Stack<>();

        for (char c : t.toCharArray()) {

            if (Character.isDigit(c)) {
                stack.push(Integer.parseInt(c + ""));
            } else {
                int b = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(stack.pop() + b);
                        break;
                    case '-':
                        stack.push(stack.pop() - b);
                        break;
                    case '*':
                        stack.push(stack.pop() * b);
                        break;
                    case '/':
                        b = stack.pop();
                        stack.push(stack.pop() / b);
                        break;
                }
            }
        }

        return stack.pop();
    }

}
