import java.util.Scanner;

public class Jurnal03 {
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();     
        int asli = n;            
        int total = 0;

        while (n > 0) {
            int digit = n % 10;          
            int faktorial = 1;

            // hitung faktorial dari digit
            int i = 1;
            while (i <= digit) {
                faktorial *= i;
                i++;
            }

            total += faktorial;          
            n /= 10;                     
        }

        if (total == asli) {
            System.out.print("YA");
        } else {
            System.out.print("BUKAN");
        }
    }
}