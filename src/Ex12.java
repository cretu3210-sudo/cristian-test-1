import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdu virsta: ");

        int  virsta = scan.nextInt();

        if(virsta <= 12) {
            System.out.println("Copil");
        } else if (virsta <=18) {
            System.out.println("Adolescent");
        }else {
            System.out.println("Adult");

        }

    }
}
