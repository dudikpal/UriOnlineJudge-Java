package beginner._1041_coordinatesofapoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordinatesOfAPointTest {

    @Test
    void testQ4() {
        String input = "4,5 -2,2";
        String expected = "Q4";

        assertEquals(expected, new CoordinatesOfAPoint().solution(input));
    }

    @Test
    void testQ1() {
        String input = "0,1 0,1";
        String expected = "Q1";

        assertEquals(expected, new CoordinatesOfAPoint().solution(input));
    }

    @Test
    void testOrigo() {
        String input = "0,0 0,0";
        String expected = "Origem";

        assertEquals(expected, new CoordinatesOfAPoint().solution(input));
    }

    @Test
    void testEixoX() {
        String input = "0,0 -2,2";
        String expected = "Eixo Y";

        assertEquals(expected, new CoordinatesOfAPoint().solution(input));
    }

    @Test
    void testQ3() {
        String input = "-0,1 -0,1";
        String expected = "Q3";

        assertEquals(expected, new CoordinatesOfAPoint().solution(input));
    }

}