package com.ash.inflearn;

import com.ash.inflearn.string.InfQ11;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfQ11Test {

    @Test
    public void test() {

        InfQ11 infQ11 = new InfQ11();

        assertEquals("KDKGK2SK2FJK4SLS4KFKS4", infQ11.solution("KDKGKKSKKFJKKKKSLSSSSKFKSSSS"));
    }
}