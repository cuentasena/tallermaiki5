import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas notas ingresara? ");

        int total = sc.nextInt();

        double[] notas = new double[total];

        int i = 0;

        while (i < total) {

            System.out.println("Ingrese nota: ");
            double nota = sc.nextDouble();


            notas [i] = nota;

            i++;
        }

            sc.close();

    }

}


/*import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántas notas ingresará? ");
        int total = sc.nextInt();

        double[] notas = new double[total];

        int i = 0;

        // Leer las notas
        while (i < total) {
            System.out.println("Ingrese nota #" + (i + 1) + ":");
            double nota = sc.nextDouble();

            // Validar que la nota esté entre 0 y 100 (opcional)
            if (nota < 0 || nota > 100) {
                System.out.println("Nota inválida. Ingrese un valor entre 0 y 100.");
                continue; // vuelve a pedir la misma nota
            }

            notas[i] = nota;
            i++;
        }

        sc.close();

        // Calcular promedio, nota más alta y más baja
        double suma = 0;
        double max = notas[0];
        double min = notas[0];

        for (int j = 0; j < total; j++) {
            suma += notas[j];

            if (notas[j] > max) {
                max = notas[j];
            }

            if (notas[j] < min) {
                min = notas[j];
            }
        }

        double promedio = suma / total;

        // Mostrar resultados
        System.out.println("Promedio: " + promedio);
        System.out.println("Nota más alta: " + max);
        System.out.println("Nota más baja: " + min);
    }
}

📝 Notas:

Corregí el bucle while (i <= total) → debe ser i < total para evitar un ArrayIndexOutOfBoundsException.

Guardé cada nota en el arreglo notas[i] (antes no se almacenaban).

Cerré el Scanner al final del proceso de entrada.

Incluí validación opcional para asegurarse de que las notas estén en un rango válido (puedes quitarla si no la necesitas).
 */