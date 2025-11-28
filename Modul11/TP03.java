import java.util.Scanner;
public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner z = new Scanner(System.in);
        String kal = z.nextLine();

        kal = kal.trim();

        if(kal.equals("")){
            System.out.println(0);
        } else {
            String[] pisah = kal.split(" ");
            int hit = 0;

            for(int i=0;i<pisah.length;i++){
                if(!pisah[i].equals("")){
                    hit++;
                }
            }

            System.out.println(hit);
        }
    }
}
