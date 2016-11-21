import java.util.HashMap;

public class ATM {
    String customerName;
    String accountYorN;
    Integer balanceHolder;
    Integer menuSelection;
    Integer withdraw;

    boolean openerGetout;
    boolean menuGetOut;

    HashMap<String, Integer> customerBalances = new HashMap();

    public void atm() {
    System.out.println("Welcome, customer...");
    accounts();
    keyedName();
    }

    public void accounts() {
        customerBalances.put("Kyle", 100000);
        customerBalances.put("Matthew", 100000);
        customerBalances.put("Alice", 100000);
        customerBalances.put("Angelia", 100000);
    }

    public void keyedName (){
        System.out.println("Please type your name on the line below and press enter.");
        customerName = Main.scanner.nextLine();
    }

    public void keyedMenu (){
            System.out.println(customerName + " type 1 to check balance, Type 2 to withdraw, Type 3 to cancel/log out. Type 4 to close your account. [1/2/3/4]");
            menuSelection = Integer.parseInt(Main.scanner.nextLine());
    }

    public void withDrawn() {
        System.out.println("Please key amount to withdraw on line below.");
        withdraw = Integer.parseInt(Main.scanner.nextLine());
        {
                balanceHolder = (customerBalances.get(customerName) - withdraw);
                customerBalances.put(customerName, balanceHolder);
                System.out.println("Please wait while your cash is dispensed.");
                System.out.println("Thank you. Here is your new balance: " + customerBalances.get(customerName));
            }
    }

    public void accountOpener() {
        System.out.println("You must create an account to do that.");
        System.out.println("Would you like to open an account now? [Y/N]");
        accountYorN = Main.scanner0.nextLine();
        do {
            openerGetout = false;
            if (accountYorN.equalsIgnoreCase("y")) {
                customerBalances.put(customerName, 100000);
                System.out.println("Thank you. Account created.");
                openerGetout = true;
            } else if (accountYorN.equalsIgnoreCase("n")) {
                System.out.println("Have a nice day!");
                openerGetout = true;
               }
            } while (openerGetout = false);
    }
    public void accountCloser (){
        customerBalances.remove(customerName);
    }

    public Boolean menuMenu() {
            keyedMenu();
            if ((menuSelection == 1) && (customerBalances.containsKey(customerName))) {
                System.out.println("Here is your current balance: " + customerBalances.get(customerName));
                menuGetOut = false;
            } else if ((menuSelection == 1) && (!customerBalances.containsKey(customerName))) {
                accountOpener();
            } else if ((menuSelection == 2) && (customerBalances.containsKey(customerName))) {
                System.out.println("Loading withdraw menu...");
                withDrawn();
            } else if ((menuSelection == 2) && (!customerBalances.containsKey(customerName))) {
                accountOpener();
            } else if (menuSelection == 3) {
                System.out.println("Transaction Cancelled. Have a nice day!");
                return false;
            } else if (menuSelection == 4) {
                accountCloser();
                System.out.println("Account closed for " + customerName);
                System.out.println("Have a nice day!");
                return false;
            }
return true;
        }
}




