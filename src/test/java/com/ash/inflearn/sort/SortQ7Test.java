package com.ash.inflearn.sort;

import com.ash.utils.TestScanner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortQ7Test {

    @Test
    public void test() {
        SortQ7 sortQ7 = new SortQ7();
        TestScanner testScanner = new TestScanner("5\n" +
                "2 7\n" +
                "1 3\n" +
                "1 2\n" +
                "2 5\n" +
                "3 6\n");

        sortQ7.solution(testScanner.getScanner());

    }

}