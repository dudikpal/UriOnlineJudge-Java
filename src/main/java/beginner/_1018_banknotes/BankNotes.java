package beginner._1018_banknotes;

import java.util.Scanner;

public class BankNotes {

    public String solution(String input) {

        Scanner sc = new Scanner(input);
        int value = sc.nextInt();
        System.out.println(value);
        StringBuilder sb = new StringBuilder();
        sb.append(value + "\n");
        System.out.println(value / 100 + " nota(s) de R$ 100,00");
        sb.append(value / 100 + " nota(s) de R$ 100,00\n");
        value %= 100;
        System.out.println(value / 50 + " nota(s) de R$ 50,00");
        sb.append(value / 50 + " nota(s) de R$ 50,00\n");
        value %= 50;
        System.out.println(value / 20 + " nota(s) de R$ 20,00");
        sb.append(value / 20 + " nota(s) de R$ 20,00\n");
        value %= 20;
        System.out.println(value / 10 + " nota(s) de R$ 10,00");
        sb.append(value / 10 + " nota(s) de R$ 10,00\n");
        value %= 10;
        System.out.println(value / 5 + " nota(s) de R$ 5,00");
        sb.append(value / 5 + " nota(s) de R$ 5,00\n");
        value %= 5;
        System.out.println(value / 2 + " nota(s) de R$ 2,00");
        sb.append(value / 2 + " nota(s) de R$ 2,00\n");
        value %= 2;
        System.out.println(value / 1 + " nota(s) de R$ 1,00");
        sb.append(value / 1 + " nota(s) de R$ 1,00");
        return sb.toString();
    }
}
