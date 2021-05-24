package beginner._1021_banknotesandcoins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BanknotesAndCoinsTest {

    @Test
    void test() {
        String input = "576,73";
        String expected = """
                NOTAS:
                5 nota(s) de R$ 100.00
                1 nota(s) de R$ 50.00
                1 nota(s) de R$ 20.00
                0 nota(s) de R$ 10.00
                1 nota(s) de R$ 5.00
                0 nota(s) de R$ 2.00
                MOEDAS:
                1 moeda(s) de R$ 1.00
                1 moeda(s) de R$ 0.50
                0 moeda(s) de R$ 0.25
                2 moeda(s) de R$ 0.10
                0 moeda(s) de R$ 0.05
                3 moeda(s) de R$ 0.01
                """;
        assertEquals(expected, new BanknotesAndCoins().solution(input));
    }

}