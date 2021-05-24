package beginner._1035_selectiontest1;

import java.util.Scanner;

public class SelectionTest1 {

    public String solution(String input) {

        Scanner sc = new Scanner(input);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        if (b > c && d > a
        && c + d > a + b
        && c > 0 && d > 0
        && a % 2 == 0) {
            System.out.println("Valores aceitos");
            return "Valores aceitos";
        } else {
            System.out.println("Valores nao aceitos");
        }
        return "Valores nao aceitos";
    }
}
