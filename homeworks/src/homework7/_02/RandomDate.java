package homework7._02;

import java.time.LocalDate;
import java.util.Random;


public class RandomDate {
    public static void main(String[] args) {
        printRandomDate();
    }

    public static void printRandomDate() {
        Random random = new Random();
        int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2015, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        LocalDate printRandomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println(printRandomDate);
    }

}



