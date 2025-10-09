import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        //input bilangan bulat N
        int bilanganBulatN = input.nextInt();

        //variabel double untuk perhitungan desimal 
        double diskon = 0;
        double totalsetelahDiskon;
        double pajak;
        double totalDibayar;

        // jika transaksi lebih dari 200000, maka diskon 5%
        if (bilanganBulatN > 200000){
            diskon = bilanganBulatN * 0.05;
        }

        //total setelah diskon 
        totalsetelahDiskon = bilanganBulatN - diskon;

        //hitunglah pajak setalah diskon
        pajak = totalsetelahDiskon *0.11;

        //total akhir 
        totalDibayar = totalsetelahDiskon + pajak;

        //hasil tampilan 
        System.out.println("transaksi = " + bilanganBulatN);
        if (diskon > 0){
            //baris ini hanya berjalan jika ada diskon 
            System.out.println("total = " + bilanganBulatN + " - " + (int)diskon);
        } else {
            //baris ini hanya berjalan jika tidak ada diskon
            System.out.println("total = " + bilanganBulatN);    
        }
        System.out.println("Ppn 11% = " + pajak);
        System.out.println("total dibayar = " + totalDibayar);

        input.close();
    }
}
