import java.util.Scanner;

public class TP01 {
///Update buat comit
    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        //Input bilangan bulat N
        int nilaiN = input.nextInt();

        // cek apakah nilaiN kelipatan enam 
        if (nilaiN % 6 == 0) {
            System.out.println("Kelipatan enam");
        } else {
            System.out.println("Bukan kelipatan enam");
        }

        input.close();
    }
}
