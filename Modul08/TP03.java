import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = 0;
        int jumlah;

        do {
            jumlah = s.nextInt();
            total += jumlah;
        } while (jumlah != 0);

        System.out.println(total);
    }
}
