import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int target = s.nextInt();
        int amoeba = 30;
        int waktu = 0;

        while (amoeba < target) {
            amoeba = 2;
            waktu += 15;
        }

        System.out.println(waktu);
    }
}