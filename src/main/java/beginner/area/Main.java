package beginner.area;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


    }

    public static String solution(String input) {
        Scanner sc = new Scanner(input);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double pi = 3.14159;
        StringBuilder sb = new StringBuilder();
        DecimalFormat f = new DecimalFormat(".000");
        //f.applyPattern(".000");
        double result = a * c / 2;
        sb.append("TRIANGULO: ").append(f.format(result)).append("\n");
        result = c * c * pi;
        sb.append("CIRCULO: ").append(f.format(result)).append("\n");
        result = (a + b) * c / 2;
        sb.append("TRAPEZIO: ").append(f.format(result)).append("\n");
        result = b * b;
        sb.append("QUADRADO: ").append(f.format(result)).append("\n");
        result = a * b;
        sb.append("RETANGULO: ").append(f.format(result)).append("\n");
        System.out.println(sb.toString());
        System.out.printf("TRIANGULO: %.3f\n", (a * c) / 2);
        System.out.printf("CIRCULO: %.3f\n", c * c * 3.14159);
        System.out.printf("TRAPEZIO: %.3f\n", ((a + b) / 2) * c);
        System.out.printf("QUADRADO: %.3f\n", b * b);
        System.out.printf("RETANGULO: %.3f\n", a * b);
        System.out.println("TRIANGULO: " + f.format(a * c / 2));
        System.out.println("CIRCULO: " + f.format(c * c * pi));
        System.out.println("TRAPEZIO: " + f.format((a + b) * c / 2));
        System.out.println("QUADRADO: " + f.format(b * b));
        System.out.println("RETANGULO: " + f.format(a * b));
        return sb.toString();
    }

}
