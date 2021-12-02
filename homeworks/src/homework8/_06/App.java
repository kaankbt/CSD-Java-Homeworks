package homework8._06;

import java.util.Scanner;

class App {
    public static void main(String[] args) {
        IsJavaIdentifierTest.run();
    }
}

class IsJavaIdentifierTest {
    private IsJavaIdentifierTest() {
    }

    public static void run() {
        Scanner kb = new Scanner(System.in);

        for (; ; ) {
            System.out.print("Bir yazı giriniz:");
            String s = kb.nextLine();

            System.out.println(IsJavaIdentifierTest.isJavaIdentifier(s) ? "Geçerli" : "Geçersiz");

            if ("elma".equals(s))
                break;
        }
    }

    public static boolean isJavaIdentifier(String s) {
        if (s.equals("_"))
            return false; //Java 9 ve sonrası için kdeğişken kontrolü

        if (s.isBlank())
            return false;

        char ch = s.charAt(0);

        if (!Character.isJavaIdentifierStart(ch))
            return false;

        int length = s.length();

        for (int i = 1; i < length; ++i)
            if (!Character.isJavaIdentifierPart(s.charAt(i)))
                return false;

        return true;
    }
}