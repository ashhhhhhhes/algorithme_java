package com.ash.inflearn.search;

import com.ash.utils.StringParseUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchQ10Test {

    @Test
    void solution() {
        // 5 3
        //1 2 8 4 9
        SearchQ10 T = new SearchQ10();

        assertEquals(3, T.solution(5,3 , StringParseUtils.stringToArray("1 2 8 4 9")));
    }
}