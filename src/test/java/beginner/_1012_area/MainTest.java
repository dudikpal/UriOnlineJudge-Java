package beginner._1012_area;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void test() {
        String input = "3,0 4,0 5,2";
        String expected = """
                TRIANGULO: 7,800
                CIRCULO: 84,949
                TRAPEZIO: 18,200
                QUADRADO: 16,000
                RETANGULO: 12,000
                """;
        assertEquals(expected, new Main().solution(input));
    }

    @Test
    void test2() {
        String input = "12,7 10,4 15,2";
        String expected = """
                TRIANGULO: 96,520
                CIRCULO: 725,833
                TRAPEZIO: 175,560
                QUADRADO: 108,160
                RETANGULO: 132,080
                """;
        assertEquals(expected, new Main().solution(input));
    }

    @Test
    void test3() {
        String input = "2,1 3,2 4,5";
        String expected = """
                TRIANGULO: 4,725
                CIRCULO: 63,617
                TRAPEZIO: 11,925
                QUADRADO: 10,240
                RETANGULO: 6,720
                """;
        assertEquals(expected, new Main().solution(input));
    }

}