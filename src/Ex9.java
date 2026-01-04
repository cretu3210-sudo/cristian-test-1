public class Ex9 {
    public static void main(String[] args) {
    int luna = 14;
    String anotimpul;

    switch (luna) {
            case 12:
            case 1:
            case 2:
                anotimpul = "Iarna";
                break;
            case 3:
            case 4:
            case 5:
                anotimpul = "Primavara";
                break;
            case 6:
            case 7:
            case 8:
                anotimpul = "Vara";
                break;
            case 9:
            case 10:
            case 11:
                anotimpul = "Toamna";
                break;
            default:
                anotimpul = ("Luna nu a fost indicata.");
                break;
        }
        System.out.println("Anotimpul: " + anotimpul);
    }
}
