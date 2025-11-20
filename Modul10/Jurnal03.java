import java.util.Scanner;
public class Jurnal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); 
        int angkaSaatini = 0;

        for (int i = N; i >= 1; i-= 1) {
            for (int j = 1; j <= i; j++) {
                System.out.print(angkaSaatini % 10); 
                angkaSaatini++;
            }
            System.out.println(); 
        }
    }
}