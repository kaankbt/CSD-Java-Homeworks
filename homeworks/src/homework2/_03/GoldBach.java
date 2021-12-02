package homework2._03;

import java.util.Scanner;

public class GoldBach {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i, j, n, k, b = 0, c = 0, sum = 0;
        System.out.println("Enter the Number: ");

        int num = sc.nextInt();

        k = num;

        int arr1[] = new int[num];
        int arr2[] = new int[num];

        if (num % 2 != 0) {

            System.out.println("Invalid Input, Number is Odd.");
        } else {

            for (i = 1; i <= num; i++) {
                for (j = 1; j <= i; j++) {

                    if (i % j == 0) {

                        c++;
                    }
                }
                if ((c == 2) && (i % 2 != 0)) {

                    arr1[b] = i;

                    arr2[b] = i;

                    b++;
                }
                c = 0;
            }
            System.out.println("Odd and Prime Pairs are: ");
            for (i = 0; i < b; i++) {
                for (j = i; j < b; j++) {

                    sum = arr1[i] + arr2[j];

                    if (sum == k) {

                        System.out.print(arr1[i] + " , " + arr2[j]);
                        System.out.println();
                    }
                }
            }
            System.out.println(k + " is a Goldbach number.");
        }
    }
}

