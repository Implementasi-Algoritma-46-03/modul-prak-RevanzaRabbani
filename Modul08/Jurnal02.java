import java.util.Scanner;

public class Jurnal02 {
    public static void main(final String[] args) {
        
        Scanner s = new Scanner(System.in);
        int total = 0;
        int jumlah = 0;
        int angka;

        angka = s.nextInt(); /// pembacaan variable angka

        
        while (angka != 0) {
            total += angka;   
            jumlah++;         
            angka = s.nextInt(); ///if 0 stop
        }

        double rata = (double) total / jumlah; /// rata 3 total 60
        System.out.printf("%.2f",rata);
    }
}