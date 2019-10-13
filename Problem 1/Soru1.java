import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mesaj = scan.nextLine();

        int diziUzunluk = (int) Math.sqrt(mesaj.length());
        char[][] dizi = new char[diziUzunluk][diziUzunluk];

        int satir = 0;
        int sutun = 0;
        int x = 0;
        int indeks = 0;
         //x mesaj uzunluğuna gelene kadar while döner geldikten sonra döngüden çıkar
        // while döngülerini aşağı ,sağ,yukarı ve sola kadar olanları girer merkeze ulaşana kadar devam eder

        while (true) {
            while (satir < diziUzunluk - x) {
                dizi[satir++][sutun] = mesaj.charAt(indeks++);
            }
            satir--;
            sutun++;
            while (sutun < diziUzunluk - x) {
                dizi[satir][sutun++] = mesaj.charAt(indeks++);
            }
            sutun--;
            satir--;
            while (satir >= x) {
                dizi[satir--][sutun] = mesaj.charAt(indeks++);
            }
            x++;
            satir++;
            sutun--;
            while (sutun >= x) {
                dizi[satir][sutun--] = mesaj.charAt(indeks++);
            }
            sutun++;
            satir++;

            if (x == diziUzunluk) {
                break;
            }
        }
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j]);
            }
        }
    }
}