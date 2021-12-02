package homework6;

import java.util.Random;
import java.util.Scanner;

public class CrapsApp {
    public static void main(String[] args) {
        WinLose.craps();
    }
}

class WinLose {
    public static void craps() {
        Random random = new Random();
        Scanner kb = new Scanner(System.in);
        System.out.println("Zarları fırlatmak için 'A' tuşla çıkmak için 'E' tuşla");
        String a = new String(kb.nextLine());

        if (a.equals("A")) {
            System.out.println("Zar atıldı...");
        }
        if (a.equals("E")) {
            System.out.println("Bye bye.");
            System.exit(1);
        }
        int upperbound = 6;
        int lowerbound = 1;
        int dice1 = random.nextInt(upperbound - lowerbound) + lowerbound;
        int dice2 = random.nextInt(upperbound - lowerbound) + lowerbound;

        int craps = dice1 + dice2;
        for (; ; ) {
            if (dice1 + dice2 == 7 || dice1 + dice2 == 11) {
                System.out.printf("1.zar:%d , 2.zar: % d ->toplam: %d%n", dice1, dice2, craps);
                System.out.println("Oyuncu kazandı,tebriklerr!");
                break;
            }
            if (dice1 + dice2 == 2 || dice1 + dice2 == 3 || dice1 + dice2 == 12) {
                System.out.printf("1.zar:%d , 2.zar: % d ->toplam: %d%n", dice1, dice2, craps);
                System.out.println("Oyuncu kaybetti!");
                break;
            } else {
                System.out.printf("1.zar:%d , 2.zar: % d ->toplam: %d%n", dice1, dice2, craps);
                System.out.println("Oyun devam ediyor...");
                WinLose.craps();

            }
        }

    }
}






