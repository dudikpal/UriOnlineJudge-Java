package beginner._1015_distancebetweentwopoints;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {

    public String solution(String input) {

        Scanner sc = new Scanner(input);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        sc.nextLine();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.printf("%.4f", Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        return String.format("%.4f", Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }
}
