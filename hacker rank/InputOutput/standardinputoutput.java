
import java.util.Scanner;

public class main10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        double b = input.nextDouble();
        String my = input.nextLine();
        if (my.isEmpty()) {
            my=input.nextLine();
        }

        System.out.println("String:" + " " + my);
        System.out.println("Double:" + " " + b);
        System.out.println("Int:" + " " + a);

    }

}

