
import java.util.Scanner;

public class main10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print(a);
            System.out.print(" x ");
            System.out.print(i);
            System.out.print(" = ");
            System.out.println(a * i);

        }

    }

}

