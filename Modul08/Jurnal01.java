import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        
        Scanner s = new Scanner(System.in);

        double radioAktif = s.nextDouble();
        int hari =  s.nextInt();

        while(hari >= 10) {
            radioAktif *= 0.5;
            hari-=10;
        }
        System.out.printf("%.3f", radioAktif);
    }
}