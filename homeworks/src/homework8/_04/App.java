package homework8._04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        SqueezeTest.run();
    }
}

class SqueezeTest {
    private SqueezeTest() {

    }

    public static String squeeze(String s1, String s2) {
        String str = "";
        int length = s1.length();

        for (int i = 0; i < length; ++i) {
            char ch = s1.charAt(i);
            if (!s2.contains(ch + ""))
                str += ch;
        }

        return str;
    }

    public static void run() {
        Scanner kb = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Birinci yazıyı giriniz:");
            String s1 = kb.nextLine();

            System.out.println("İkinci yazıyı giriniz:");
            String s2 = kb.nextLine();

            System.out.println(SqueezeTest.squeeze(s1, s2));

            if ("stop".equals(s1))
                break;
        }
    }
}