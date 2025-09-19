mport java.util.Scanner;

public class Numeromagic{
    public static void main(String[] args) {
        // Numero magico: sumar digitos hasta obtener 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero: ");
        int n = sc.nextInt();
        int orig = n;
        while (n > 9) {
            int suma = 0;
            while (n > 0) {
                suma = suma + (n % 10);
                n = n / 10;
            }
            n = suma;
        }
        if (n == 1) {
            System.out.println("Magico");
        } else {
            System.out.println("No magico");
        }
        sc.close();
    }
}
