import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {

        Scanner in = new Scanner(System.in);

        int masukan = in.nextInt();

        // Bagian naik
        for (int i = 1; i <= masukan ; i++){
            for (int j = 1; j < i; j++){
                System.out.print(" ");
            }
            System.out.println(i);  
        }

        // Bagian turun
        for (int i = masukan - 1; i >= 1; i--){
            for (int s = 1; s < i; s++){
                System.out.print(" ");
            }
            System.out.println(i);
        }

        in.close();
    }
}