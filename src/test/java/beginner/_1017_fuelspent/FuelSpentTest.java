package beginner._1017_fuelspent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuelSpentTest {

    @Test
    void test() {
        String input = """
                10
                85""";
        String expected = "70,833";
        assertEquals(expected, new FuelSpent().solution(input));
    }

}