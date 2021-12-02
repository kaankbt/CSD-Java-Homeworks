package homework1._03;

import java.util.Scanner;

public class Signum {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter number:");
        int val = Integer.parseInt(kb.nextLine());

        if (val < 0) {
            System.out.println("negative!");
            val = -1;
            System.out.println(val);
        }

        if (val == 0) {
            System.out.println("zero!");
            val = 0;
            System.out.println(val);
        }

        if (val > 0) {
            System.out.println("positive!");
            val = 1;
            System.out.println(val);
        }
    }
}
