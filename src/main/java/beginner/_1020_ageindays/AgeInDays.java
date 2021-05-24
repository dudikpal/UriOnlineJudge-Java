package beginner._1020_ageindays;

import java.util.Scanner;

public class AgeInDays {

    public String solution(String input) {

        Scanner sc = new Scanner(input);
        int days = sc.nextInt();
        int years = days / 365;
        days %= 365;
        int months = days / 30;
        days %= 30;
        System.out.println(years + " ano(s)\n" +
                months + " mes(es)\n" +
                days + " dia(s)");
        return years + " ano(s)\n" +
                months + " mes(es)\n" +
                days + " dia(s)\n";
    }
}
