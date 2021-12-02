package homework12._01;

public class App {
    public static void main(String[] args) {
        double[] dizi = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double StandartSapma = Hesapla(dizi);

        System.out.print("Sayılar: ");
        for (double sayi : dizi) {
            System.out.print(sayi + ", ");
        }

        System.out.format("\n Sayıların Standart Sapması = %.6f \n", StandartSapma);
    }

    public static double Hesapla(double dizi[]) {
        double toplam = 0.0, StandartSapma = 0.0;
        int length = dizi.length;

        for (double sayi : dizi) {
            toplam += sayi;
        }

        double ortalama = toplam / length;

        for (double sayi : dizi) {
            StandartSapma += Math.pow(sayi - ortalama, 2);
        }

        return Math.sqrt(StandartSapma / length);
    }
}