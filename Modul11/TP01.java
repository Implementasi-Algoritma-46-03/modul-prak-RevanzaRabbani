import java.util.Scanner;
public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner a = new Scanner(System.in);

        int b = a.nextInt();  
        a.nextLine();

        String[] x = new String[b];

        for(int i=0;i<b;i++){
            x[i] = a.nextLine();
        }

        for(int i=0;i<b;i++){
            System.out.println("Bulan " + (i+1) + ": " + x[i]);
        }
    }
}
