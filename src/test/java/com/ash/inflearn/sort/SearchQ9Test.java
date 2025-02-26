package com.ash.inflearn.sort;

import com.ash.utils.StringParseUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchQ9Test {

    @Test
    public void solution() {
        SearchQ9 T = new SearchQ9();
        assertEquals(17, T.solution(3, StringParseUtils.stringToArray("1 2 3 4 5 6 7 8 9")));
        assertEquals(2, T.solution(4, StringParseUtils.stringToArray("1 1 1 1 1")));

    }

}