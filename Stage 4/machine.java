package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waterQuantity = 400;
        int milkQuantity = 540;
        int coffeeBeansQuantity = 120;
        int cupsDisposable = 9;
        int money = 550;
        
        
        System.out.println("The coffee machine has:");
        System.out.println(waterQuantity + " ml of water");
        System.out.println(milkQuantity + " ml of milk");
        System.out.println(coffeeBeansQuantity + " g of coffee beans");
        System.out.println(cupsDisposable + " disposable cups");
        System.out.println("$" + money + " of money");
        
        System.out.println("Write action (buy, fill, take):");
        String action = scanner.nextLine();
        
        if (action.equals("buy")) {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
            int choice = scanner.nextInt();
            if (choice == 1) {
                // For the espresso, the coffee machine needs 250 ml of water and 16 g of coffee beans. It costs $4.
                int coffeePrice = 4;
                int waterQuantityNeeded = 250;
                int coffeeBeansNeeded = 16;
                int milkNeeded = 0;
                int cupsUsed = 1;
                
                waterQuantity = waterQuantity - waterQuantityNeeded;
                milkQuantity = milkQuantity - milkNeeded;
                coffeeBeansQuantity = coffeeBeansQuantity - coffeeBeansNeeded;
                cupsDisposable = cupsDisposable - cupsUsed;
                money = money + coffeePrice;
                
                System.out.println("The coffee machine has:");
                System.out.println(waterQuantity + " ml of water");
                System.out.println(milkQuantity + " ml of milk");
                System.out.println(coffeeBeansQuantity + " g of coffee beans");
                System.out.println(cupsDisposable + " disposable cups");
                System.out.println("$" + money + " of money");
                
            }
            if (choice == 2) {
                // For the latte, the coffee machine needs 350 ml of water, 75 ml of milk, and 20 g of coffee beans. It costs $7.
                int coffeePrice = 7;
                int waterQuantityNeeded = 350;
                int coffeeBeansNeeded = 20;
                int milkNeeded = 75;
                int cupsUsed = 1;
                
                waterQuantity = waterQuantity - waterQuantityNeeded;
                milkQuantity = milkQuantity - milkNeeded;
                coffeeBeansQuantity = coffeeBeansQuantity - coffeeBeansNeeded;
                cupsDisposable = cupsDisposable - cupsUsed;
                money = money + coffeePrice;
                
                System.out.println("The coffee machine has:");
                System.out.println(waterQuantity + " ml of water");
                System.out.println(milkQuantity + " ml of milk");
                System.out.println(coffeeBeansQuantity + " g of coffee beans");
                System.out.println(cupsDisposable + " disposable cups");
                System.out.println("$" + money + " of money");
                
            }
            
            if (choice == 3) {
                // And for the cappuccino, the coffee machine needs 200 ml of water, 100 ml of milk, and 12 g of coffee beans. It costs $6
                int coffeePrice = 6;
                int waterQuantityNeeded = 200;
                int coffeeBeansNeeded = 12;
                int milkNeeded = 100;
                int cupsUsed = 1;
                
                waterQuantity = waterQuantity - waterQuantityNeeded;
                milkQuantity = milkQuantity - milkNeeded;
                coffeeBeansQuantity = coffeeBeansQuantity - coffeeBeansNeeded;
                cupsDisposable = cupsDisposable - cupsUsed;
                money = money + coffeePrice;
                
                System.out.println("The coffee machine has:");
                System.out.println(waterQuantity + " ml of water");
                System.out.println(milkQuantity + " ml of milk");
                System.out.println(coffeeBeansQuantity + " g of coffee beans");
                System.out.println(cupsDisposable + " disposable cups");
                System.out.println("$" + money + " of money");
                
            }
            
        }
        
        if (action.equals("fill")) {
            System.out.println("Write how many ml of water you want to add:");
            int waterQtyToFill = scanner.nextInt();
            System.out.println("Write how many ml of milk you want to add:");
            int milkQtyToFill = scanner.nextInt();
            System.out.println("Write how many grams of coffee beans you want to add:");
            int coffeeBeansQtyToFill = scanner.nextInt();
            System.out.println("Write how many disposable cups of coffee you want to add:");
            int cupsToFill = scanner.nextInt();
            
            waterQuantity = waterQuantity + waterQtyToFill;
            milkQuantity = milkQuantity + milkQtyToFill;
            coffeeBeansQuantity = coffeeBeansQuantity + coffeeBeansQtyToFill;
            cupsDisposable = cupsDisposable + cupsToFill;
            
            System.out.println("The coffee machine has:");
            System.out.println(waterQuantity + " ml of water");
            System.out.println(milkQuantity + " ml of milk");
            System.out.println(coffeeBeansQuantity + " g of coffee beans");
            System.out.println(cupsDisposable + " disposable cups");
            System.out.println("$" + money + " of money");

        }
        
        if (action.equals("take")) {
            int moneyTaken = money;
            System.out.println("I gave you $" + money);
            
            money = money - moneyTaken; 
            
            System.out.println("The coffee machine has:");
            System.out.println(waterQuantity + " ml of water");
            System.out.println(milkQuantity + " ml of milk");
            System.out.println(coffeeBeansQuantity + " g of coffee beans");
            System.out.println(cupsDisposable + " disposable cups");
            System.out.println("$" + money + " of money");

        }    
    }
}
