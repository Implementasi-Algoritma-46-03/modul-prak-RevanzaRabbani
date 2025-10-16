import java.util.Scanner;

public class Jurnal02 {
///Update buat comit
    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        double median = (A + B + C) / 3;

        System.out.printf("Nilai rata-rata: %.2f",median);
        input.close();
    }
}
