package beginner._1016_distance;

import java.util.Scanner;

public class Distance {

    public String solution(String input) {

        Scanner sc = new Scanner(input);
        int distance = sc.nextInt();
        System.out.println(distance * 2 + " minutos");
        return distance * 2 + " minutos";
    }
}
