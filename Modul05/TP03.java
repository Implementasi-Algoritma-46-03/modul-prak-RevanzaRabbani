import java.util.Scanner;
///Update buat comit
public class TP03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama = scanner.nextLine().toLowerCase();
        String angkaInput = scanner.nextLine();
        String[] angka = angkaInput.trim().split(" ");

        switch (nama) {
            case "persegi":
                int sisi = Integer.parseInt(angka[0]);
                int luasPersegi = sisi * sisi;
                int kelilingPersegi = 4 * sisi;
                System.out.println(luasPersegi + " " + kelilingPersegi);
                break;

            case "persegi panjang":
                int panjang = Integer.parseInt(angka[0]);
                int lebar = Integer.parseInt(angka[1]);
                int luasPP = panjang * lebar;
                int kelilingPP = 2 * (panjang + lebar);
                System.out.println(luasPP + " " + kelilingPP);
                break;

            case "segitiga":
                int alas = Integer.parseInt(angka[0]);
                int tinggi = Integer.parseInt(angka[1]);
                double luasSegitiga = 0.5 * alas * tinggi;
                double sisiMiring = Math.sqrt(alas * alas + tinggi * tinggi);
                double kelilingSegitiga = alas + tinggi + sisiMiring;

                if (luasSegitiga % 1 == 0 && kelilingSegitiga % 1 == 0) {
                    System.out.printf("%.0f %.0f\n", luasSegitiga, kelilingSegitiga);
                } else {
                    System.out.printf("%.2f %.2f\n", luasSegitiga, kelilingSegitiga);
                }
                break;

            case "lingkaran":
                int diameter = Integer.parseInt(angka[0]);
                double phi = 3.14;
                double jariJari = diameter / 2.0;
                double luasLingkaran = phi * jariJari * jariJari;
                double kelilingLingkaran = phi * diameter;

                if (luasLingkaran % 1 == 0 && kelilingLingkaran % 1 == 0) {
                    System.out.printf("%.0f %.0f\n", luasLingkaran, kelilingLingkaran);
                } else {
                    System.out.printf("%.2f %.2f\n", luasLingkaran, kelilingLingkaran);
                }
                break;

            default:
                System.out.println("Bangun datar tidak dikenali");
        }

        scanner.close();
    }
}