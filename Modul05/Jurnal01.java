import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        int kodeMenu = input.nextInt();
        int jumlahMakanan = input.nextInt();

        String namaMenu = "";
        int hargaSatuan = 0;
        int totalHarga = 0;

        switch (kodeMenu) {
            case 1:
                namaMenu = "Nasi Goreng";
                hargaSatuan = 15000;
                break;
            case 2:
                namaMenu = "Mie Goreng / Nyemek";
                hargaSatuan = 18000;
                break;
            case 3:
                namaMenu = "Kwetiau Goreng / Nyemek";
                hargaSatuan = 20000;
                break;
            case 4:
                namaMenu = "Capcay Goreng / Kuah";
                hargaSatuan = 23000;
                break;
            default:
                System.out.println("Kode menu tidak valid.");
                return;
        }

        totalHarga = hargaSatuan * jumlahMakanan;

        System.out.printf("%s %d buah, total harga Rp. %,d\n", namaMenu, jumlahMakanan, totalHarga);
    }
}