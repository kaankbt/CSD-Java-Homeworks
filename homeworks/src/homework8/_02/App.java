package homework8._02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        DisplayTextApp.run();
    }
}

class DisplayTextApp {
    public static void displayText(String str) {
        int length = str.length();

        for (int i = 0; i < length; ++i) {
            for (int k = 0; k <= i; ++k)
                System.out.print(str.charAt(k));

            System.out.println();
        }
    }

    public static void run() {
        Scanner kb = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Bir yazı giriniz(çıkmak için exit tuşlayın) :");
            String str = kb.nextLine();

            if ("exit".equals(str))
                break;

            displayText(str);
        }
    }
}
