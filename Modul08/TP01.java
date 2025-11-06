import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int target = s.nextInt();
        int amoeba = 30;
        int waktu = 0;

        while (amoeba < target) {
            amoeba *= 2;   // amoeba membelah diri jadi 2x lipat
            waktu += 15;   // setiap pembelahan butuh 15 menit
        }

        System.out.println(waktu);
    }
}