package homework3._04;

public class Factorian {
    public static void main(String[] args) {
        IsFactorianTest.run();
    }
}

class IsFactorianTest {
    public static void run() {
        for (int n = 1; n < 100000; ++n)
            if (NumberUtil.isFactorian(n))
                System.out.println(n);
    }
}

class NumberUtil {
    public static boolean isFactorian(int n) {
        return n > 0 && getDigitsFactorialSum(n) == n;
    }

    public static int getDigitsFactorialSum(int n) {
        int sum = 0;

        while (n != 0) {
            sum += factorial(n % 10);
            n /= 10;
        }

        return sum;
    }

    public static int factorial(int n) {
        int result = 1;

        for (; n >= 2; --n)
            result *= n;

        return result;
    }
}