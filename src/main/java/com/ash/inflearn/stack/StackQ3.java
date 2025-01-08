package com.ash.inflearn.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 3. 크레인 인형뽑기(카카오)
 */
public class StackQ3 {

    public int solution(int n, int[][] board, int m, int[] moves) {

        List<Stack<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = n-1; j > -1; j--) {
                if (board[j][i] > 0) {
                    stack.push(board[j][i]);
                }
            }

            arr.add(stack);
        }

        Stack<Integer> basket = new Stack<>();

        int answer = 0;
        for (int move : moves) {
            Stack<Integer> stack = arr.get(move - 1);
            if (!stack.isEmpty()) {
                int doll = stack.pop();
                if (!basket.isEmpty() && doll == basket.peek()) {
                    basket.pop();
                    answer+=2;
                } else {
                    basket.push(doll);
                }
            }
        }

        return answer;
    }

}
