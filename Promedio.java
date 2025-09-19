import java.util.Scanner;
public class Promedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantas notas: ");
        int n = sc.nextInt();
        float[] notas = new float[n];
        int i = 0;
        while (i < n) {
            notas[i] = sc.nextFloat();
            i++;
        }
        float suma = 0, alto = notas[0], bajo = notas[0];
        i = 0;
        while (i < n) {
            suma = suma + notas[i];
            if (notas[i] > alto) alto = notas[i];
            if (notas[i] < bajo) bajo = notas[i];
            i++;
        }
        float promedio = suma / n;
        System.out.println("Promedio: " + promedio);
        System.out.println("Alta: " + alto);
        System.out.println("Baja: " + bajo);
        sc.close();
    }
}
