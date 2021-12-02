package homework1._01;

import java.util.Scanner;

public class MaxMinMidApp {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz:");
        int a = Integer.parseInt(kb.nextLine());

        System.out.println("İkincici sayıyı giriniz:");
        int b = Integer.parseInt(kb.nextLine());

        System.out.println("Üçüncü sayıyı giriniz:");
        int c = Integer.parseInt(kb.nextLine());

        if (a == b && a == c)

            System.out.printf("%d = %d = %d", a, b, c);

        else if (a == b && a != c) {

            if (a < c)
                System.out.printf("%d = %d < %d", a, b, c);

            else
                System.out.printf("%d < %d = %d", c, a, b);

        }

        // b ve c eşit a eşit değilse
        else if (b == c && a != b) {

            if (b < a)
                System.out.printf("%d = %d < %d", b, c, a);

            else
                System.out.printf("%d < %d = %d", a, b, c);

        }

        // a ve c eşit b eşit değilse
        else if (a == c && a != b) {

            if (a < b)
                System.out.printf("%d = %d < %d", a, c, b);

            else
                System.out.printf("%d < %d = %d", b, a, c);
        }

        //Tüm sayılar farklı ise
        else {

            // a en küçük ise
            if (a < c && a < b) {

                if (b < c)
                    System.out.printf("%d < %d < %d", a, b, c);

                else
                    System.out.printf("%d < %d < %d", a, c, b);
            }

            // b en küçük ise
            else if (b < a && b < c) {

                if (a < c)
                    System.out.printf("%d < %d < %d", b, a, c);

                else
                    System.out.printf("%d < %d < %d", b, c, a);
            }

            //c en küçük ise
            else {

                if (a < b)
                    System.out.printf("%d < %d < %d", c, a, b);

                else
                    System.out.printf("%d < %d < %d", c, b, a);
            }
        }
        int total = a + b + c;
        int mid = total / 3;

        System.out.println("\nMid number:" + mid);
    }
}



