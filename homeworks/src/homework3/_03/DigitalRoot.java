package homework3._03;

import java.util.Scanner;

import static java.lang.Math.abs;

public class DigitalRoot {
    public static void main(String[] args) {
        CalculateDigitalRootTest.run();
    }
}

class CalculateDigitalRootTest {
    public static void run() {
        Scanner kb = new Scanner(System.in);

        for (; ; ) {
            System.out.print("Bir sayı giriniz:");
            int val = Integer.parseInt(kb.nextLine());

            System.out.printf("%d sayısının basamaksal kökü:%d%n", val, NumberUtil.calculateDigitalRoot(val));

            if (val == 0)
                break;
        }

    }
}

class NumberUtil {
    public static int calculateDigitalRoot(int val) {
        int root = abs(val);

        while (root > 9)
            root = digitsSum(root);

        return root;
    }

    public static int digitsSum(int val) {
        int sum = 0;

        while (val != 0) {
            sum += val % 10;
            val /= 10;
        }
        return abs(sum);
    }
}