import java.util.Scanner;

public class TP03 {
///Update buat comit
   public static void main(final String[] args) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      int var3 = var1.nextInt();
      int var4 = var1.nextInt();
      if (var2 > var3 && var2 > var4) {
         System.out.println("Dira");
      } else if (var3 > var2 && var3 > var4) {
         System.out.println("Radi");
      } else {
         System.out.println("Idar");
      }

      var1.close();
   }
}
