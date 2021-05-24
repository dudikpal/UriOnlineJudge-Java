package beginner._1013_thegreatest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheGreatestTest {

    @Test
    void test() {
        String input = "7 14 106";
        String expected = "106 eh o maior";
        assertEquals(expected, new TheGreatest().solution(input));
    }

    @Test
    void test2() {
        String input = "217 14 6";
        String expected = "217 eh o maior";
        assertEquals(expected, new TheGreatest().solution(input));
    }

}