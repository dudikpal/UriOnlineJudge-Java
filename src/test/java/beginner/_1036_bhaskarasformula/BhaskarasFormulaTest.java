package beginner._1036_bhaskarasformula;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BhaskarasFormulaTest {

    @Test
    void test() {
        String input = "10,0 20,1 5,1";
        String expected = """
                R1 = -0,29788
                R2 = -1,71212
                """;
        assertEquals(expected, new BhaskarasFormula().solution(input));
    }

    @Test
    void test2() {
        String input = "10,0 3,0 5,0";
        String expected = "Impossivel calcular";
        assertEquals(expected, new BhaskarasFormula().solution(input));
    }

    @Test
    void test3() {
        String input = "10,3 203,0 5,0";
        String expected = """
                R1 = -0,02466
                R2 = -19,68408
                """;
        assertEquals(expected, new BhaskarasFormula().solution(input));
    }

}