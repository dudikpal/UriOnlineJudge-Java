package beginner._1014_consumption;

import java.util.Scanner;

public class Consumption {

    public String solution(String input) {

        Scanner sc = new Scanner(input);
        int km = sc.nextInt();
        sc.nextLine();
        double consumption = sc.nextDouble();
        System.out.printf("%.3f km/l\n", km / consumption);
        return String.format("%.3f km/l\n", km / consumption);
    }
}
