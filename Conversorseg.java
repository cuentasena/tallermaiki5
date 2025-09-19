import java.util.Scanner;
public class Conversorseg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Segundos: ");
        int s = sc.nextInt();
        int h = 0, m = 0;
        h = s / 3600;
        m = (s % 3600) / 60;
        s = s % 60;
        System.out.println(h + ":" + m + ":" + s);
        sc.close();
    }
}
