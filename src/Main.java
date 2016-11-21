
import java.util.Scanner;



public class Main extends ATM {

    public static Scanner scanner = new Scanner(System.in);
    public static Scanner scanner0 = new Scanner(System.in);
    public static Main main = new Main();
    public static ATM atm = new ATM();


    public static void main(String[] args) {
do {
    atm.atm();
    boolean weRunthis = true;

    do {
        weRunthis = atm.menuMenu();
    } while (weRunthis);
}while (true);


    }
}
