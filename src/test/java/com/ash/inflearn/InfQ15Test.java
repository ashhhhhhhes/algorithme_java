package com.ash.inflearn;

import org.junit.jupiter.api.Test;

class InfQ15Test {

    @Test
    void solution() {
        InfQ15 infQ15 = new InfQ15();

        infQ15.solution(10,
                new int[]{1, 2, 1, 2, 1, 3, 3, 2, 3, 1},
                new int[]{3, 3, 3, 2, 3, 3, 2, 3, 2, 3}
        );
    }
}