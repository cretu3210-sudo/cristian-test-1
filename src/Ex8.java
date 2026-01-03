import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("introduceto ora");
        int ora = scanner.nextInt();
         if (ora < 7) {
             System.out.println("Dimineata devreme");
         }else if (ora < 10) {
             System.out.println("dimineata");

             }else if (ora < 17) {
                 System.out.println("Ziua");
             }else {
                 System.out.println("Seara");
             }

         }
    }

