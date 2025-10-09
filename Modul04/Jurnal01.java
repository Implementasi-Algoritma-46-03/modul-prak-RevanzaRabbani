import java.util.Scanner;
public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
         Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        if (24 % N == 0 && 56 % N == 0) {
            System.out.println(N + " adalah faktor dari 24 dan 56");
        } else {
            System.out.println(N + " bukan faktor dari 24 dan 56");
        }
    }
}
