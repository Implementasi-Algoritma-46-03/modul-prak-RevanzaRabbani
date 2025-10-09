import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah transaksi
        int totalTransaksi = input.nextInt();

        // Deklarasi variabel untuk perhitungan
        double diskon = 0.0;
        double totalSetelahDiskon;
        double pajak;
        double totalDibayar;

        // Hitung diskon jika transaksi lebih dari 200000
        if (totalTransaksi > 200000) {
            diskon = totalTransaksi * 0.05;
        }

        // Hitung total setelah diskon
        totalSetelahDiskon = totalTransaksi - diskon;

        // Hitung PPN 11%
        pajak = totalSetelahDiskon * 0.11;

        // Hitung total yang harus dibayar
        totalDibayar = totalSetelahDiskon + pajak;

        // Tampilkan hasil
        System.out.println("Transaksi = " + totalTransaksi);
        
        if (diskon > 0) {
            System.out.println("Total = " + totalTransaksi + " - " + (int)diskon);
        } else {
            System.out.println("Total = " + totalTransaksi);
        }

        System.out.printf("PPN 11%% = %.2f\n", pajak);
        System.out.printf("Total dibayar = %.2f\n", totalDibayar);

        input.close();
    }
}