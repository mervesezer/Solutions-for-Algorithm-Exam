import java.util.ArrayList;
import java.util.Scanner;

public class Soru3 {
    //Toplamlar arrayliste atıldıktan sonra bu methodta en büyük olan bulunup return ediliyor
    public static int calculateBiggest(ArrayList<Integer> biggestSum) {
        int max = biggestSum.get(0);

        for (int item : biggestSum){
            if (item > max){
                max = item;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> biggestSum = new ArrayList<>();

        System.out.print("kaça kaçlık matris olsun ?:");
        int n = scan.nextInt();

        int[][] matrix = new int[n][n];
        System.out.print("matris elemanlarını giriniz:\n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        int maxSum = n + n - 2;
        int sum = 0;

        //Her çapraz olan elemanın satır ve sütün sayıları toplamı eşit olduğu için
        // oradan hareketle bu for döngüsü bulmaktadır
        for (int k = 0; k <= maxSum; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i + j - k == 0) {
                        sum += matrix[i][j];
                    }
                }
            }
            biggestSum.add(sum);
            sum = 0;
        }

        System.out.println(calculateBiggest(biggestSum));
    }
}
