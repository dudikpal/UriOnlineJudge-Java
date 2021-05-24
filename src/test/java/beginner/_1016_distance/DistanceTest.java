package beginner._1016_distance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceTest {

    @Test
    void test() {
        String input = "110";
        String expected = "220 minutos";
        assertEquals(expected, new Distance().solution(input));
    }

}