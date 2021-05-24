package beginner._1017_fuelspent;

import java.util.Scanner;

public class FuelSpent {

    public String solution(String input) {

        Scanner sc = new Scanner(input);
        int hours = sc.nextInt();
        sc.nextLine();
        int avgSpeed = sc.nextInt();
        System.out.printf("%.3f", hours * avgSpeed / 12.0);
        return String.format("%.3f", hours * avgSpeed / 12.0);
    }
}
