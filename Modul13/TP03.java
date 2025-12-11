import java.util.*;

public class TP03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = input.nextInt();
        }

        int key = input.nextInt();

        int indeks = -1;
        for (int i = 0; i < n; i++) {
            if (data[i] == key) {
                indeks = i;
                break;
            }
        }

        if (indeks != -1) {
            System.out.println("Ditemukan di indeks ke-" + indeks);
        } else {
            System.out.println("Tidak ditemukan");
        }
    }
}