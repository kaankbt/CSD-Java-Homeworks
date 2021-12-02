package homework5._04;

import java.util.Scanner;

public class App {
    private static Scanner sc;

    public static boolean isPerfect(String[] args) {
        int i, Number, Sum = 0;
        sc = new Scanner(System.in);
        System.out.println("\n Please Enter any Number: ");
        Number = sc.nextInt();

        for (i = 1; i < Number; i++) {
            if (Number % i == 0) {
                Sum = Sum + i;
            }
        }
        if (Sum == Number) {
            return true;
        } else {
            return false;
        }

    }
}
