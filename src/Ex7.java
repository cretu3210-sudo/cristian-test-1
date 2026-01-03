import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introdu virsta: ");
        int varstaUtilizator = scan.nextInt();

        if (varstaUtilizator % 2 == 0) {
            System.out.println("Numar par");


        } else {
            System.out.println("numar impar");
        }

    }
}
