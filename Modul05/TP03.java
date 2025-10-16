import java.util.Scanner;

public class TP03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String bangunDatar = input.nextLine().toLowerCase();  // case-insensitive input
        double luas = 0;
        double keliling = 0;

        switch (bangunDatar) {
            case "persegi":
                int sisi = input.nextInt();
                luas = sisi * sisi;
                keliling = 4 * sisi;
                // cetak bulat tanpa desimal
                System.out.printf("%.0f %.0f\n", luas, keliling);
                break;

            case "persegi panjang":
                int panjang = input.nextInt();
                int lebar = input.nextInt();
                luas = panjang * lebar;
                keliling = 2 * (panjang + lebar);
                System.out.printf("%.0f %.0f\n", luas, keliling);
                break;

            case "segitiga":
                int alas = input.nextInt();
                int tinggi = input.nextInt();
                luas = 0.5 * alas * tinggi;
                double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
                keliling = alas + tinggi + sisiMiring;

                // jika luas dan keliling bilangan bulat, cetak tanpa desimal
                if (isInteger(luas) && isInteger(keliling)) {
                    System.out.printf("%.0f %.0f\n", luas, keliling);
                } else {
                    // jika tidak bulat, cetak 2 desimal dengan pembulatan benar
                    luas = round2Decimals(luas);
                    keliling = round2Decimals(keliling);
                    System.out.printf("%.2f %.2f\n", luas, keliling);
                }
                break;

            case "lingkaran":
                int diameter = input.nextInt();
                double pi = 3.14;
                double r = diameter / 2.0;
                luas = pi * r * r;
                keliling = pi * diameter;

                if (isInteger(luas) && isInteger(keliling)) {
                    System.out.printf("%.0f %.0f\n", luas, keliling);
                } else {
                    luas = round2Decimals(luas);
                    keliling = round2Decimals(keliling);
                    System.out.printf("%.2f %.2f\n", luas, keliling);
                }
                break;

            default:
                System.out.println("Bangun datar tidak dikenali");
                break;
        }

        input.close();
    }

    // fungsi cek apakah double hampir integer (selisih < 1e-6)
    public static boolean isInteger(double x) {
        double epsilon = 1e-6;
        return Math.abs(x - Math.round(x)) < epsilon;
    }

    // fungsi untuk membulatkan ke 2 desimal dengan benar
    public static double round2Decimals(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}