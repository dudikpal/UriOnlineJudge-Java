package beginner._1014_consumption;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsumptionTest {

    @Test
    void test() {
        String input = """
                500
                35,0""";
        String expected = "14,286 km/l\n";
        assertEquals(expected, new Consumption().solution(input));
    }

}