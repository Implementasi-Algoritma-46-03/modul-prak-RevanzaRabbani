import java.util.Scanner;

public class Jurnal01 { ///Update buat comit

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int lembarSeribu = n / 1000;
        int sisauang = n % 1000;

        System.out.println(lembarSeribu);
        System.out.println(sisauang);
    }
}
