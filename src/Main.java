import java.util.Scanner;



public class Main {

    public static Main main = new Main();
    public static Scanner scanner = new Scanner (System.in);
    public static Customeraccounts customeraccounts = new Customeraccounts();
    public static Names name = new Names();
    public static Menu menu = new Menu();
    public static Withdrawl withdrawl = new Withdrawl();

    public static void main(String[] args) {

        System.out.println("Welcome, customer...");

        Customeraccounts.customeraccounts();
        Names.names();
        Withdrawl.withdrawl();

    }
}