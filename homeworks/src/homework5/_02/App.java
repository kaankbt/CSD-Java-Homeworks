package homework5._02;

import java.util.Scanner;

public class App {
    static int divSum(int n) {
        if (n == 1)
            return 1;

        int result = 0;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {

                if (i == (n / i))
                    result += i;
                else
                    result += (i + n / i);
            }
        }

        return (result + n + 1);

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("n =");
        int n = kb.nextInt();
        System.out.println(divSum(n));
    }
}