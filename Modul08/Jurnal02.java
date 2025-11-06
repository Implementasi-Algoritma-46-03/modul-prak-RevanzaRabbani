import java.util.Scanner;

public class Jurnal02 {
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int total = 0;
        int jumlah = 0;
        int angka;

        angka = s.nextInt();

        
        while (angka != 0) {
            total += angka;   
            jumlah++;         
            angka = s.nextInt(); 
        }

        double rata = (double) total / jumlah; 
        System.out.printf("%.2f",rata);
    }
}