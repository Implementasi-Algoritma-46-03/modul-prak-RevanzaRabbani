import java.util.Scanner; 

public class Jurnal03 {
///Update buat comit
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 

        int Dira = in.nextInt(); 
        int Radi = in.nextInt();
        int Idar = in.nextInt(); 
        // Tujuan: Menampilkan ketiga angka dalam urutan menaik (dari yang terkecil ke terbesar)
        if (Dira < Radi && Dira < Idar) { 
            if (Radi < Idar) { 
                System.out.println("Dira, Radi, Idar"); 
            } else {
                System.out.println("Dira, Idar, Radi"); 
            }
        } else if (Radi < Dira && Radi < Idar) { 
            if (Dira < Idar) { 
                System.out.println("Radi, Dira, Idar"); 
            } else {
                System.out.println("Radi, Idar, Dira"); 
            }
        } else { 
            if (Dira < Radi) { 
                System.out.println("Idar, Dira, Radi"); 
            } else {
                System.out.println("Idar, Radi, Dira"); 
            }
        }

        in.close();
    }
}