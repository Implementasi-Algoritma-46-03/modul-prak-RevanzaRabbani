import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        //Input bilangan bulat N
        int nilaiN = input.nextInt();

        // cek apakah nilaiN kelipatan enam 
        if (nilaiN % 6 == 0) {
            System.out.println("kelipatan enam");
        } else {
            System.out.println("Bukan Kelipatan enam");
        }

        input.close();
    }
}
