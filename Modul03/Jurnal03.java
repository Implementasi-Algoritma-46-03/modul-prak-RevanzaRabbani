import java.util.Scanner;

public class Jurnal03 {
///Update buat comit
    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int P = input.nextInt();
        int A =input.nextInt();
        int B = input.nextInt();

        double penilaian = ((0.25 * P )) + ((0.35 * A )) + (( 0.40 * B ));
        System.out.printf("%.2f",penilaian);
        System.out.println();
        boolean mk = penilaian >= 75;
        System.out.println("Lulus MK: " + mk);
        input.close();


    }
}
