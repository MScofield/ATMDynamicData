
public class Withdrawl extends Menu {
    Integer withdraw;

    public static void withdrawl(){
    }
    public void withDrawn() {
        //withdraw = 0;
        withdraw = Main.scanner.nextInt();
        if (withdraw > customerBalances.get(customerName)) {
            System.out.println("Insufficient Funds");
        } else if (withdraw <= customerBalances.get(customerName)) {
            balanceHolder = (customerBalances.get(customerName) - withdraw);
            customerBalances.put(customerName, balanceHolder);
            System.out.println("Please wait while your cash is dispensed.");
            System.out.println("Thank you. Here is your new balance: " + customerBalances.get(customerName));
        }
    }


}

