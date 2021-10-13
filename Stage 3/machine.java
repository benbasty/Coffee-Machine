package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int waterQty = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkQty = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeWght = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int coffeeCups = scanner.nextInt();
        
        int numCupsAvailable = Math.min(waterQty/200, Math.min(milkQty/50,coffeeWght/15));
         
        if (coffeeCups == numCupsAvailable) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (coffeeCups > numCupsAvailable) {
            System.out.println("No, I can make only " + numCupsAvailable + " cup(s) of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + (numCupsAvailable - coffeeCups) + " more than that)");
        }    
    }
}
