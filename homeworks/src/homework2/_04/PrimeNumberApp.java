package homework2._04;

import java.util.Scanner;

public class PrimeNumberApp {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Sayı giriş:");
        int num = Integer.parseInt(kb.nextLine());

        int fac = 2;

        if (num < 1) {
            System.out.println("Girdiğiniz değer pozitif bir doğal sayı değil!");
        } else {
            while (num != 1) {
                if (num % fac == 0) {
                    num = num / fac;
                    System.out.println(fac);
                    fac = 2;
                } else {
                    fac++;
                }
            }
        }
    }
}
