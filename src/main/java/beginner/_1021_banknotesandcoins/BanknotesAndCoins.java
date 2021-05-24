package beginner._1021_banknotesandcoins;

import java.util.Scanner;

public class BanknotesAndCoins {

    public String solution(String input) {

        Scanner sc = new Scanner(input);
        double inputValue = sc.nextDouble();
        int integer = (int)inputValue;
        int fraction = (int)(inputValue % 1 * 100); 
        StringBuilder sb = new StringBuilder();
        System.out.println("NOTAS:");
        sb.append("NOTAS:\n");
        System.out.println(integer / 100 + " nota(s) de R$ 100.00");
        sb.append(integer / 100 + " nota(s) de R$ 100.00\n");
        integer %= 100;
        System.out.println(integer / 50 + " nota(s) de R$ 50.00");
        sb.append(integer / 50 + " nota(s) de R$ 50.00\n");
        integer %= 50;
        System.out.println(integer / 20 + " nota(s) de R$ 20.00");
        sb.append(integer / 20 + " nota(s) de R$ 20.00\n");
        integer %= 20;
        System.out.println(integer / 10 + " nota(s) de R$ 10.00");
        sb.append(integer / 10 + " nota(s) de R$ 10.00\n");
        integer %= 10;
        System.out.println(integer / 5 + " nota(s) de R$ 5.00");
        sb.append(integer / 5 + " nota(s) de R$ 5.00\n");
        integer %= 5;
        System.out.println(integer / 2 + " nota(s) de R$ 2.00");
        sb.append(integer / 2 + " nota(s) de R$ 2.00\n");
        integer %= 2;
        System.out.println("MOEDAS:");
        sb.append("MOEDAS:\n");
        System.out.println(integer + " moeda(s) de R$ 1.00");
        sb.append(integer + " moeda(s) de R$ 1.00\n");
        fraction %= 100;
        System.out.println(fraction / 50 + " moeda(s) de R$ 0.50");
        sb.append(fraction / 50 + " moeda(s) de R$ 0.50\n");
        fraction %= 50;
        System.out.println(fraction / 25 + " moeda(s) de R$ 0.25");
        sb.append(fraction / 25 + " moeda(s) de R$ 0.25\n");
        fraction %= 25;
        System.out.println(fraction / 10 + " moeda(s) de R$ 0.10");
        sb.append(fraction / 10 + " moeda(s) de R$ 0.10\n");
        fraction %= 10;
        System.out.println(fraction / 5 + " moeda(s) de R$ 0.05");
        sb.append(fraction / 5 + " moeda(s) de R$ 0.05\n");
        fraction %= 5;
        System.out.println(fraction + " moeda(s) de R$ 0.01");
        sb.append(fraction + " moeda(s) de R$ 0.01\n");
        return sb.toString();
    }
}
