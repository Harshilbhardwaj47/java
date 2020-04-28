
import java.util.Scanner;

public class main10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        for (int i = 0; i < r; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            for (int j = 0; j < c; j++) {
                a += b;
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(a);
                b = b * 2;

            }
            System.out.println("");
        }
        input.close();

    }

}

