package homework2._01;

import java.util.Scanner;

public class BaklavaDesignApp {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int i, j;

        int space, line, star;

        line = 11;
        space = line / 2;
        star = 1;

        //line
        for (i = 0; i < line; i++) {
            //space
            for (j = 0; j < space; j++) {
                System.out.print(" ");
            }

            //star
            for (j = 0; j < star; j++) {
                System.out.print("*");
            }

            //üst kısım
            if (i < line / 2) {
                space--;
                star += 2;
            }

            //alt kısım
            else {
                space++;
                star -= 2;
            }
        }
    }
}
