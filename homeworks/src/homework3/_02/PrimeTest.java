package homework3._02;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class PrimeTest {
    public static void main(String[] args) {
        IsPrimeXTest.run();
    }
}

class IsPrimeXTest {
    public static void run() {
        Scanner kb = new Scanner(System.in);

        for (; ; ) {
            System.out.print("Bir sayı giriniz:");
            int val = Integer.parseInt(kb.nextLine());

            if (NumberUtil.isPrimeX(val))
                System.out.printf("%d sayısı özel asaldır\n", val);
            else
                System.out.printf("%d sayısı özel asal değildir\n", val);

            if (val == 0)
                break;
        }
    }
}

class NumberUtil {
    public static boolean isPrimeX(int val) {
        int sum = val;
        boolean result;

        while ((result = isPrime(sum)) && sum > 9)
            sum = digitsSum(sum);

        return result;
    }

    public static int digitsSum(int val) {
        int sum = 0;

        while (val != 0) {
            sum += val % 10;
            val /= 10;
        }

        return abs(sum);
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