import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        int kodeMenu = input.nextInt();
        int jumlahMakan = input.nextInt();
        int totalHarga = 0;

        switch (kodeMenu) {
            case 1:
            totalHarga = jumlahMakan * 15.000;
            System.out.printf(null, args)(null);
                break;
            
            case 2:
            default:
                break;
        }

        


    }
}
