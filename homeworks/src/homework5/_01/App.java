package homework5._01;

public class App {
    public static void main(String[] args) {
        FindEulerNumberApp.run();
    }
}

class FindEulerNumberApp {
    public static void run() {
        System.out.println(Util.e());
    }
}

class Util {
    public static double e() {
        double result = 2;

        for (int i = 2; i < 10; ++i)
            result += 1 / (double) NumberUtil.factorial(i);

        return result;
    }
}

class NumberUtil {
    public static long factorial(int n) {
        long result = 1;

        for (; n >= 2; --n)
            result *= n;

        return result;
    }
}