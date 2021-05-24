package beginner._1015_distancebetweentwopoints;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceBetweenTwoPointsTest {

    @Test
    void test() {
        String input = """
                1,0 7,0
                5,0 9,0""";
        String expected = "4,4721";
        assertEquals(expected, new DistanceBetweenTwoPoints().solution(input));
    }

}