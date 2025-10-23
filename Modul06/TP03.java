import java.util.Scanner; 

public class TP03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        // User memasukkan nama bangun datar
        String nama = input.nextLine();

        switch (nama.toLowerCase()) { 
            case "persegi":
                int sisi = input.nextInt();
                tampilkanHasil(hitungLuasPersegi(sisi), hitungKelilingPersegi(sisi));
                break;

            case "persegi panjang":
                int panjang = input.nextInt();
                int lebar = input.nextInt();
                tampilkanHasil(hitungLuasPersegiPanjang(panjang, lebar), hitungKelilingPersegiPanjang(panjang, lebar));
                break;

            case "segitiga":
                int alas = input.nextInt();
                int tinggi = input.nextInt();
                tampilkanHasil(hitungLuasSegitiga(alas, tinggi), hitungKelilingSegitiga(alas, tinggi));
                break;

            case "lingkaran":
                int diameter = input.nextInt();
                tampilkanHasil(hitungLuasLingkaran(diameter), hitungKelilingLingkaran(diameter));
                break;

            default:
                System.out.println("Bangun datar tidak dikenal");
        }

        input.close();
    }

    private static void tampilkanHasil(double luas, double keliling) {
        // Hasil tanpa desimal (dibulatkan)
        System.out.printf("%.0f %.0f\n", luas, keliling);
    }

    private static double hitungLuasPersegi(int sisi) {
        return sisi * sisi;
    }

    private static double hitungKelilingPersegi(int sisi) {
        return 4 * sisi;
    }

    private static double hitungLuasPersegiPanjang(int p, int l) {
        return p * l;
    }

    private static double hitungKelilingPersegiPanjang(int p, int l) {
        return 2 * (p + l);
    }

    private static double hitungLuasSegitiga(int alas, int tinggi) {
        return 0.5 * alas * tinggi;
    }

    private static double hitungKelilingSegitiga(int alas, int tinggi) {
        double miring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return alas + tinggi + miring;
    }

    private static double hitungLuasLingkaran(int diameter) {
        double r = diameter / 2.0;
        return 3.14 * r * r;
    }

    private static double hitungKelilingLingkaran(int diameter) {
        return 3.14 * diameter;
    }
}