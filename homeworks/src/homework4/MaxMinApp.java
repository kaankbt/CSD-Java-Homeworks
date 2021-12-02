package homework4;

import java.util.Scanner;

public class MaxMinApp {
    public static void main(String[] args) {
        CalculateSumCountMaxMinApp.run();
    }
}

class CalculateSumCountMaxMinApp {
    public static int getValue(Scanner kb) {
        for (; ; ) {
            int val = Integer.parseInt(kb.nextLine());
            if (0 <= val && val <= 100)
                return val;

            System.out.println("Geçersiz değer\nYeni değer giriniz:");
        }
    }

    public static int getOption(Scanner kb) {
        for (; ; ) {
            int option = Integer.parseInt(kb.nextLine());
            if (option == 0 || option == 1)
                return option;
            System.out.println("Geçersiz değer. [Evet için 1(bir) Hayır için 0(sıfır) değerlerinden birini giriniz]:");

        }
    }

    public static void displayReport(int min, int max, int count, int sum) {
        System.out.printf("Toplam %d değer girildi%n", count);
        System.out.printf("Max = %d%n", max);
        System.out.printf("Min = %d%n", min);
        System.out.printf("Ortalama = %f%n", (double) sum / count);
    }

    public static void run() {
        Scanner kb = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        int minVal;
        int maxVal;

        System.out.print("Bir tamsayı giriniz:");
        int val = getValue(kb);

        sum += val;
        minVal = val;
        maxVal = val;

        for (; ; ) {
            System.out.print("Yeni bir değer girmek istiyor musunuz?");
            System.out.print("[Evet için 1(bir) Hayır için 0(sıfır) değerlerinden birini giriniz]:");
            int option = getOption(kb);

            if (option == 0) {
                displayReport(minVal, maxVal, count, sum);
                break;
            }

            System.out.print("Bir tamsayı giriniz:");
            val = getValue(kb);
            ++count;
            sum += val;
            minVal = Math.min(minVal, val);
            maxVal = Math.max(maxVal, val);
        }
    }
}
