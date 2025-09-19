import java.util.Scanner;
public class Matriz {
    public static void main(String[] xx) {
        Scanner t = new Scanner(System.in);
        System.out.print("Filas: ");
        int n = t.nextInt();
        System.out.print("Columnas: ");
        int m = t.nextInt();
        int[][] mat = new int[n][m];
        System.out.println("Ingrese la matriz:");
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < m) {
                mat[i][j] = t.nextInt();
                j++;
            }
            i++;
        }
        System.out.println("Traspuesta:");
        i = 0;
        while (i < m) {
            int j = 0;
            while (j < n) {
                System.out.print(mat[j][i] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
        t.close();
    }
}
