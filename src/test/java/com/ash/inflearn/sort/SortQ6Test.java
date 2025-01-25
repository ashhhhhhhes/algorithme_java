package com.ash.inflearn.sort;

import com.ash.utils.StringParseUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortQ6Test {

    @Test
    public void solution() {
        SortQ6 T = new SortQ6();


        assertEquals("3 8", T.solution(new int[]{120, 125, 152, 130, 135, 135, 143, 127, 160}));
        assertEquals("24 27", T.solution(StringParseUtils.stringToArray("122 123 125 125 128 130 133 137 138 138 140 141 142 143 145 147 149 149 154 154 155 157 161 167 167 167 161 170 173 173")));
    }

}