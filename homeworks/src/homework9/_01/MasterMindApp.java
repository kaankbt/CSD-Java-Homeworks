package homework9._01;

import java.util.Scanner;

public class MasterMindApp {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int val[] = new int[9999];
        int rigth = 10;
        int num = 0;

        System.out.println("Lütfen 1000-9999 arasında bir sayı belirleyin.");
        System.out.print("Seçtiğiniz değer :");
        val[0] = kb.nextInt();

        if (val[0] < 1000) {
            System.out.println("Girilen sayı 999 dan büyük olmalı...");
            rigth--;
            System.exit(0);
        }

        for (int i = 0; i < val.length; i++) {
            System.out.print("Tahmini sayın :");
            num = kb.nextInt();

            if (num > val[0]) {
                rigth--;
                System.out.println("__________________________________");
                System.out.println("Belirlenen sayı :" + val[0]);
                System.out.println("Tahmin edilen sayı :" + num);
                System.out.println("Kalan Hak :" + rigth);
                System.out.println("Verilecek bilgi : -");
                System.out.println("__________________________________");
            }
            if (num < val[0]) {
                rigth--;
                System.out.println("__________________________________");
                System.out.println("Belirlenen sayı :" + val[0]);
                System.out.println("Tahmin edilen sayı :" + num);
                System.out.println("Kalan Hak :" + rigth);
                System.out.println("Verilecek bilgi : +");
                System.out.println("__________________________________");
            }
            if (num == val[0]) {
                System.out.println("__________________________________");
                System.out.println("Tebrikler doğru cevap." + num);
                System.out.println("__________________________________");
                break;
            }
            if (rigth == 0) {
                System.out.println("__________________________________");
                System.out.println("Hakların tükendi oyunu kaybettin !");
                System.out.println("__________________________________");
                break;
            }
            if (num < 1000) {
                rigth--;
                System.out.println("Geçersiz değer girdiniz");
                System.out.println("Kalan Hak :" + rigth);
            }
        }
    }
}
