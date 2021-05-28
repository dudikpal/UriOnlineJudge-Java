package beginner._1041_coordinatesofapoint;

import java.util.Scanner;

public class CoordinatesOfAPoint {

    public String solution(String input) {
        Scanner sc = new Scanner(input);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        String result = "";
        if (x == 0 && y == 0) {
            result = "Origem";
        } else if (x == 0) {
            result = "Eixo Y";
        } else if (y == 0) {
            result = "Eixo X";
        } else if (x > 0 && y > 0) {
            result = "Q1";
        } else if (x < 0 && y > 0) {
            result = "Q2";
        } else if (x < 0 && y < 0) {
            result = "Q3";
        } else {
            result = "Q4";
        }
        System.out.println(result);
        return result;
    }
}
