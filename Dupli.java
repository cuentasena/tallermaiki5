import java.util.Scanner;
public class Dupli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño arreglo: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Elementos:");
        int i = 0;
        while (i < n) {
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println("Sin duplicados:");
        i = 0;
        while (i < n) {
            boolean repe = false;
            int j = 0;
            while (j < i) {
                if (arr[j] == arr[i]) repe = true;
                j++;
            }
            if (repe == false) System.out.print(arr[i] + " ");
            i++;
        }
        sc.close();
    }
}
