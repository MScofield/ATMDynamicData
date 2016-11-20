
public class Names {

    public static void names (){
    }
    String customerName;

    public void keyedName() {
        do {
            System.out.println("Please type your name on the line below.");
            customerName = Main.scanner.nextLine();
            if (!customerName.isEmpty()) {
                continue;
            } else if (customerName.isEmpty()) {
                System.out.println("A name entry is required.");
            }
        }while (customerName.isEmpty());
    }
}


