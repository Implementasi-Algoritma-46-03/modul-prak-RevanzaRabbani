import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama bulan");
        String Bulan = input.nextLine();

            switch (Bulan){
                case "januari":
                    System.out.println("janvier");
                    break;
                case "februari":
                    System.out.println("Février");
                    break;
                case "maret":
                    System.out.println("Mars");
                    break;
                case "april":
                    System.out.println("Avril");
                    break;
                case "mei":
                    System.out.println("Peut");
                    break;
                case "juni":
                    System.out.println("Juin");
                    break;
                case "juli":
                    System.out.println("Juillet");
                    break;
                case "agustus":
                    System.out.println("Août");
                    break;
                case "september":
                    System.out.println("Septembre");
                    break;
                case "oktober":
                    System.out.println("Octobre");
                    break;
                case "november":
                    System.out.println("Novembre");
                    break;
                case "desember":
                    System.out.println("Décembre");
                    break;
                default:
                    break;
            }
    }
}

