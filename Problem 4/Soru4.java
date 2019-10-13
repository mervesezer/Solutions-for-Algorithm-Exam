import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int column = scan.nextInt();

        int[][] matrix = new int[row][column];

        int maximum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                int carpim = matrix[i][j] * matrix[i][j + 1] * matrix[i + 1][j];
                if (carpim > maximum) maximum = carpim;
            }
        }

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                int carpim = matrix[i][j] * matrix[i][j - 1] * matrix[i + 1][j];
                if (carpim > maximum) maximum = carpim;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                int carpim = matrix[i][j] * matrix[i - 1][j] * matrix[i][j + 1];
                if (carpim > maximum) maximum = carpim;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                int carpim = matrix[i][j] * matrix[i][j - 1] * matrix[i - 1][j];
                if (carpim > maximum) maximum = carpim;
            }
        }

        System.out.println(maximum);
    }
}
