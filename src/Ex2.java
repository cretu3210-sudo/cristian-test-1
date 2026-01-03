import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduceti va rog ptimul numar: ");
        int primulNumar = scan.nextInt();

        System.out.print("Introduceti va rog al doilea numar: ");
        int alDoileaNumar = scan.nextInt();

        int rezultat = primulNumar * alDoileaNumar;
        System.out.println("rezultat: " + rezultat);

    }
}
