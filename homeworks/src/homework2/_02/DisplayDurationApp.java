package homework2._02;

import java.util.Scanner;

public class DisplayDurationApp {
    public static void main(String[] args) {

        displayDuration();
    }

    public static void displayDuration() {

        Scanner kb = new Scanner(System.in);
        System.out.println("Dönüştürmek istediğin saniye:");
        int secondval = Integer.parseInt(kb.nextLine());

        int second = secondval % 60;
        int munite = secondval / 60 % 60;
        int hour = (secondval / 60) / 60;

        String display = (hour + ":" + munite + ":" + second);

        System.out.println(display);
    }
}




