package homework8._03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        WrapWithBracesApp.run();
    }
}

class WrapWithBracesApp {
    public static String getText(String str) {
        return String.format("(%s)", str.trim());
    }

    public static void run() {
        Scanner kb = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Bir yazı giriniz:");
            String str = kb.nextLine();

            if ("stop".equals(str))
                break;

            System.out.println(getText(str));
        }
    }
}
