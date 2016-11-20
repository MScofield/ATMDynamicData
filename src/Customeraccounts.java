
import java.util.Arrays;
import java.util.HashMap;

public class Customeraccounts extends Names {

    String accountYorN;
    Integer balanceHolder;

    HashMap <String, Integer> customerBalances = new HashMap();

    public static void customeraccounts () {
    }
    public void accounts () {
        customerBalances.put("Kyle", 100000);
        customerBalances.put("Matthew", 100000);
        customerBalances.put("Alice", 100000);
    }
    public void acct() {
        //while (menu != 3);{
        if (customerBalances.containsKey(customerName)) {
            System.out.println("Options for " + customerName);
            //menu = null;
            //keyMenu();
        } else if (!customerBalances.containsKey(customerName)) {
            System.out.println("Welcome " + customerName + " you are not a current account holder.");
            //account = null;
            //createAcct();
        }
    }
    public void accountDecider(){
        accountYorN = Main.scanner.nextLine();
        while (!(Arrays.asList("n","y").contains (accountYorN))) {
            System.out.println("Would you like to create an account now? [Y/N]");
            accountYorN = Main.scanner.nextLine();
            if (accountYorN.equalsIgnoreCase("y")) {
                customerBalances.put(customerName, 100000);
                System.out.println("Thank you. Account created. Please respond to the following prompts.");
            } else if (accountYorN.equalsIgnoreCase("n")) {
                System.out.println("Have a nice day!");
            }
        }

    }
}

