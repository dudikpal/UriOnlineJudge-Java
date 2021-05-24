package beginner._1035_selectiontest1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionTest1Test {

    @Test
    void test() {
        String input = "5 6 7 8";
        String expected = "Valores nao aceitos";
        assertEquals(expected, new SelectionTest1().solution(input));
    }

}