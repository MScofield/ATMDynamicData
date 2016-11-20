
public class Menu extends Customeraccounts {


    Integer menuSelection;

    public static void menu(){
    }
    public void keyMenu () {

        while (menuSelection != 3) {
            System.out.println("Type 1 to check balance, Type 2 to withdraw, Type 3 to cancel. Type 4 to close your account. [1/2/3/4]");
            menuSelection = Main.scanner.nextInt();
            if (menuSelection == 1) {
                System.out.println("Here is your current balance: " + customerBalances.get(customerName));
            } else if (menuSelection == 2) {
                System.out.println("Please key amount to withdraw on line below.");
            } else if (menuSelection == 3) {
                System.out.println("Transaction Cancelled. Have a nice day!");
            } else if (menuSelection == 4) {
                customerBalances.remove(customerName);
                System.out.println("Account closed for " + customerName);
                System.out.println("Have a nice day!");
                break;
            }
        }
    }

}

