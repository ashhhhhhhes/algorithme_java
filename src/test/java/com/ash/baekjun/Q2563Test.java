package com.ash.baekjun;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


class Q2563Test {

    @Test
    public void solution() {
        Scanner scanner = Mockito.mock(Scanner.class);

        when(scanner.nextLine()).thenReturn("3", "3 7", "15 7", "5 2");

        Q2563 q2563 = new Q2563();
        String result = q2563.solution(scanner);

        assertEquals("260", result);
    }

}