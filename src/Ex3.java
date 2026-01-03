import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int primulNumar = scan.nextInt();
        int alDoileaNumar = scan.nextInt();

        int rezultatAdunare = primulNumar + alDoileaNumar;
        int rezultatScadere = primulNumar - alDoileaNumar;
        System.out.println("Rezultat: " + rezultatAdunare );
        System.out.println("Rezultat: " + rezultatScadere );

    }
}
