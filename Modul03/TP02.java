import java.util.Scanner;

public class TP02 {
///Update buat comit
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        // Input
        String nama = input.next();            // Membaca nama
        int jumlah = input.nextInt();          
        int harga = input.nextInt();           // Harga per barang

        // Proses
        int total = harga * jumlah;

        // Output
        System.out.println("Hi, " + nama + ". Total belanja adalah " + total + " rupiah.");

        input.close();
    }
}