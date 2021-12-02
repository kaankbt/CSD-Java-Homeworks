package homework9._02;

import java.util.Scanner;

public class SecondMaxApp {
    public static void main(String[] args) {
        SecMax.secondMax();
    }
}

class SecMax {
    public static void secondMax() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Dizinin genişliği :");
        int n = kb.nextInt();

        int[] a = new int[n];
        int max1 = a[0];
        int max2 = a[1];

        for (int i = 0; i < n; i++) {
            System.out.print("Dizinin değerlerini giriniz :");
            a[i] = kb.nextInt();
        }

        for (int i = 1; i < n; i++)
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2)
                max2 = a[i];

        System.out.println("Dizinin en büyük 2. elemanı :" + max2);
    }
}
