package beginner._1013_thegreatest;

import java.util.Scanner;

public class TheGreatest {

    public String solution(String input) {

        Scanner sc = new Scanner(input);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " eh o maior");
            return a + " eh o maior";
        } else if (b > a && b > c) {
            System.out.println(b + " eh o maior");
            return b + " eh o maior";
        } else {
            System.out.println(c + " eh o maior");
            return c + " eh o maior";
        }
        /*int ab = (a + b + Math.abs(a - b)) / 2;
        int abc = (c + ab + Math.abs(ab - c)) / 2;
        System.out.println(abc + " eh o maior");
        return abc + " eh o maior";*/
    }
}
