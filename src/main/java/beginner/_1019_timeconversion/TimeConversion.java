package beginner._1019_timeconversion;

import java.util.Scanner;

public class TimeConversion {

    public String solution(String input) {

        Scanner sc = new Scanner(input);
        int seconds = sc.nextInt();
        int hours = seconds / 3600;
        seconds %= 3600;
        int minutes = seconds / 60;
        seconds %= 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
        return hours + ":" + minutes + ":" + seconds;
    }
}
