import java.util.Scanner;
///Update buat comit testttaaa
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
                System.out.println("lundi");
                break;
            case 1:
                System.out.println("mardi");
                break;
            case 2:
                System.out.println("mercredi");
                break;
            case 3:
                System.out.println("jeudi");
                break;
            case 4:
                System.out.println("vendredi");
                break;
            case 5:
                System.out.println("samedi");
                break;
            case 6:
                System.out.println("dimanche");
                break;
        }
    }
}