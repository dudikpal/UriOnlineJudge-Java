package beginner._1036_bhaskarasformula;

import java.util.Scanner;

public class BhaskarasFormula {

    public String solution(String input) {

        Scanner sc = new Scanner(input);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double x1 = (-1 * b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double x2 = (-1 * b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        if (Double.isNaN(x1) || Double.isNaN(x2)) {
            System.out.println("Impossivel calcular");
            return "Impossivel calcular";
        } else {
            System.out.printf("R1 = %.5f\n", x1);
            System.out.printf("R2 = %.5f\n", x2);
            return String.format("R1 = %.5f\nR2 = %.5f\n", x1, x2);
        }
    }
}
