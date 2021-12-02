package homework3._05;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class SuperPrime {
    public static void main(String[] args) {
        IsSuperPrimeTest.run();
    }
}

class IsSuperPrimeTest {
    public static void run() {
        Scanner kb = new Scanner(System.in);

        for (; ; ) {
            System.out.print("Asal bir sayı giriniz:");
            int val = Integer.parseInt(kb.nextLine());

            if (val == 0)
                break;

            if (!NumberUtil.isPrime(val))
                continue;

            if (NumberUtil.isSuperPrime(val))
                System.out.printf("%d sayısı süper asaldır%n", val);
            else
                System.out.printf("%d sayısı süper asal değildir%n", val);
        }
    }
}

class NumberUtil {
    public static boolean isSuperPrime(int val) {
        return isPrime(val) && isPrime(getIndexOfPrime(val));
    }

    public static int getIndexOfPrime(int n) {
        int i = 1;
        int val = 2;

        for (; ; ) {
            if (val == n)
                return i;

            if (isPrime(val))
                ++i;

            ++val;
        }
    }

    public static boolean isPrime(int val) {
        if (val <= 1)
            return false;

        if (val % 2 == 0)
            return val == 2;

        if (val % 3 == 0)
            return val == 3;

        if (val % 5 == 0)
            return val == 5;

        if (val % 7 == 0)
            return val == 7;

        int sqrtVal = (int) sqrt(val);

        for (int i = 11; i <= sqrtVal; i += 2)
            if (val % i == 0)
                return false;

        return true;
    }
}