import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int[][] matriks = new int[N][N];

        // Input matriks
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriks[i][j] = s.nextInt();
            }
        }

        int hasil = pemenang(matriks);

        if (hasil == 1) {
            System.out.println("O");
        } else if (hasil == 2) {
            System.out.println("X");
        } else {
            if (seri(matriks)) {
                System.out.println("-");
            } else {
                System.out.println("?");
            }
        }

        s.close();
    }

    // Menentukan pemenang tic-tac-toe (dinamis untuk N x N)
    private static int pemenang(int[][] matriks) {
        int N = matriks.length;

        // Cek baris
        for (int i = 0; i < N; i++) {
            int first = matriks[i][0];
            if (first != 0) {
                boolean sama = true;
                for (int j = 1; j < N; j++) {
                    if (matriks[i][j] != first) {
                        sama = false;
                        break;
                    }
                }
                if (sama) return first;
            }
        }

        // Cek kolom
        for (int j = 0; j < N; j++) {
            int first = matriks[0][j];
            if (first != 0) {
                boolean sama = true;
                for (int i = 1; i < N; i++) {
                    if (matriks[i][j] != first) {
                        sama = false;
                        break;
                    }
                }
                if (sama) return first;
            }
        }

        // Cek diagonal utama
        int first = matriks[0][0];
        if (first != 0) {
            boolean sama = true;
            for (int i = 1; i < N; i++) {
                if (matriks[i][i] != first) {
                    sama = false;
                    break;
                }
            }
            if (sama) return first;
        }

        // Cek diagonal kedua
        first = matriks[0][N - 1];
        if (first != 0) {
            boolean sama = true;
            for (int i = 1; i < N; i++) {
                if (matriks[i][N - 1 - i] != first) {
                    sama = false;
                    break;
                }
            }
            if (sama) return first;
        }

        return 0; // Tidak ada pemenang
    }

    // Mengecek apakah seri
    private static boolean seri(int[][] matriks) {
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks.length; j++) {
                if (matriks[i][j] == 0) {
                    return false; // Masih ada ruang kosong → belum seri
                }
            }
        }
        return true; // Tidak ada 0 → papan penuh → seri
    }
}
