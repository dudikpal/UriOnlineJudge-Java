package beginner._1037_interval;

import java.util.Scanner;

public class Interval {

    public String solution(String input) {

        Scanner sc = new Scanner(input);
        double value = sc.nextDouble();
        if (value >= 0 && value <= 25) {
            System.out.println("Intervalo [0,25]");
            return "Intervalo [0,25]";
        } else if (value > 25 && value <= 50) {
            System.out.println("Intervalo (25,50]");
            return "Intervalo (25,50]";
        } else if (value > 50 && value <= 75) {
            System.out.println("Intervalo (50,75]");
            return "Intervalo (50,75]";
        } else if (value > 75 && value <= 100) {
            System.out.println("Intervalo (75,100]");
            return "Intervalo (75,100]";
        } else {
            System.out.println("Fora de intervalo");
            return "Fora de intervalo";
        }
    }
}
