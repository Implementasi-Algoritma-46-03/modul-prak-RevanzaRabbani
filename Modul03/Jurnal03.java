import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int nilaiPraktikum = input.nextInt();
        int nilaiAsesmen1 =input.nextInt();
        int nilaiAsesmen2 = input.nextInt();

        double penilaian = ((0.25 * nilaiPraktikum)) + ((0.35 * nilaiAsesmen1 )) + (( 0.40 * nilaiAsesmen2));
        System.out.printf("%2f",penilaian);
        System.out.println();
        boolean mk = penilaian >= 75;
        System.out.println("Lulus MK: " + mk);
        input.close();


    }
}
