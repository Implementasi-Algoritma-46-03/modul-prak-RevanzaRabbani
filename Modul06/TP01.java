import java.util.Scanner;
import java.util.Locale;

public class TP01 {

    // Method untuk mengubah Fahrenheit ke Celcius
    public static double fahrenheitToCelcius(double f) {
        return (5.0 / 9.0) * (f - 32);
    }

    // Method untuk mengubah Fahrenheit ke Reamur
    public static double fahrenheitToReamur(double f) {
        return (4.0 / 9.0) * (f - 32);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Memastikan pemisah desimal menggunakan titik (.)
        Scanner input = new Scanner(System.in);

        // Membaca tiga buah bilangan riil (Fahrenheit)
        double R1 = input.nextDouble();
        double R2 = input.nextDouble();
        double R3 = input.nextDouble();

        input.close();

        // Konversi ke Celcius
        double C1 = fahrenheitToCelcius(R1);
        double C2 = fahrenheitToCelcius(R2);
        double C3 = fahrenheitToCelcius(R3);

        // Konversi ke Reamur
        double Re1 = fahrenheitToReamur(R1);
        double Re2 = fahrenheitToReamur(R2);
        double Re3 = fahrenheitToReamur(R3);

        // Menampilkan hasil dengan satu angka di belakang koma
        System.out.printf("Celcius: %.1f %.1f %.1f\n", C1, C2, C3);
        System.out.printf("Reamur: %.2f %.2f %.2f\n", Re1, Re2, Re3);
    }
}
