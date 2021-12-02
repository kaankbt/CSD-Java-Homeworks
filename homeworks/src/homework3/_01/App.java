package homework3._01;

import static java.lang.Math.sqrt;

public class App {
    public static void main(String[] args) {

        SatisfyConditionsApp.run();
    }


}

class SatisfyConditionsApp {
    public static boolean isCondition1Satisfied(int a, int b, int c) {
        return 100 * c + 10 * b + a > 100 * a + 10 * b + c;
    }

    public static boolean isCondition2Satisfied(int a, int b, int c) {
        return NumberUtil.isPrime(100 * a + 10 * b + c);
    }

    public static boolean isCondition3Satisfied(int a, int b, int c) {
        return NumberUtil.isPrime(100 * c + 10 * b + a);
    }

    public static boolean isCondition4Satisfied(int a, int b) {
        return NumberUtil.isPrime(10 * a + b);
    }

    public static boolean isCondition5Satisfied(int b, int c) {
        return NumberUtil.isPrime(10 * b + c);
    }

    public static boolean isCondition6Satisfied(int b, int c) {
        return NumberUtil.isPrime(10 * c + b);
    }

    public static boolean isCondition7Satisfied(int b, int a) {
        return NumberUtil.isPrime(10 * b + a);
    }

    public static boolean isAllSatisfied(int a, int b, int c) {
        return isCondition1Satisfied(a, b, c) &&
                isCondition2Satisfied(a, b, c) &&
                isCondition3Satisfied(a, b, c) &&
                isCondition4Satisfied(a, b) &&
                isCondition5Satisfied(b, c) &&
                isCondition6Satisfied(b, c) &&
                isCondition7Satisfied(a, b);
    }

    public static void run() {

        for (int n = 100; n <= 999; ++n)
            if (isAllSatisfied(n / 100, n / 10 % 10, n % 10))
                System.out.println(n);
    }
}

class NumberUtil {
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


