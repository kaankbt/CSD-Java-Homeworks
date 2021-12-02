package homework12._02;

import java.util.HashSet;

public class App {
    static void printFirstRepeating(int[] arr) {
        int min = -1;

        HashSet<Integer> set = new HashSet<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i]))
                min = i;

            set.add(arr[i]);
        }

        if (min != -1)
            System.out.println("İlk tekrar eden sayı : " + arr[min]);
        else
            System.out.println("Tekrar eden sayı yok :" + arr[0]);
    }

    public static void main(String[] args) throws java.lang.Exception {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        printFirstRepeating(arr);
    }
}
