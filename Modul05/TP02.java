import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {

        System.out.println("Masukkan jumlah hari yang ingin dihitung:");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.close();

        int indeksHariSekarang = 4; 
        int hariKe = (indeksHariSekarang + N) % 7;

        switch (hariKe) {
            case 0:
                System.out.println("Lundi");
                break;
            case 1:
                System.out.println("Mardi");
                break;
            case 2:
                System.out.println("Mercredi");
                break;
            case 3:
                System.out.println("Jeudi");
                break;
            case 4:
                System.out.println("Vendredi");
                break;
            case 5:
                System.out.println("Samedi");
                break;
            case 6:
                System.out.println("Dimanche");
                break;
        }
    }
}