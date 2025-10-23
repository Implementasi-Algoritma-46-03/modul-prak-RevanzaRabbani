import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membaca satu baris kalimat
        String kalimat = input.nextLine();
        input.close();

        // Menghapus semua huruf vokal (besar dan kecil)
        String hasil = kalimat.replaceAll("[AIUEOaiueo]", "");

        // Menampilkan hasil kalimat tanpa vokal
        System.out.println(hasil);
    }
}