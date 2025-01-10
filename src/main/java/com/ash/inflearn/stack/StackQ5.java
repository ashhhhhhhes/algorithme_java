package com.ash.inflearn.stack;

import java.util.Stack;

/**
 * 5. 쇠막대기
 */
public class StackQ5 {

    public int solution(String s) {
        Stack<Character> pipes = new Stack<>();
        int answer = 0;

        for (int i =0; i <s.length(); i ++) {
            char c = s.charAt(i);
            if (c == '(') pipes.push(c);
            else {
                pipes.pop();
                if (s.charAt(i-1) == '(') {
                    answer += pipes.size();
                } else {
                    answer += 1;
                }
            }
        }

        return answer;
    }

}
