import java.util.*;

public class TP02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
            if (i > 0) System.out.print(" ");
        }
    }
}