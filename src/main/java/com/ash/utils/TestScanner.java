package com.ash.utils;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public final class TestScanner  {
    private final Scanner scanner;

    public Scanner getScanner() {
        return this.scanner;
    }

    public TestScanner(String[] input) {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(
                String.join("\n", input).getBytes(StandardCharsets.UTF_8)
        );

        this.scanner = new Scanner(inputStream);
    }

    public TestScanner(String input) {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(
                input.getBytes(StandardCharsets.UTF_8)
        );

        this.scanner = new Scanner(inputStream);
    }

    public int nextInt() {
        return scanner.nextInt();
    }

    // Scanner의 주요 메서드를 위임(wrapping)
    public boolean hasNextLine() {
        return scanner.hasNextLine();
    }

    public String nextLine() {
        return scanner.nextLine();
    }

    public boolean hasNext() {
        return scanner.hasNext();
    }

    public String next() {
        return scanner.next();
    }

    public void close() {
        scanner.close();
    }
}
