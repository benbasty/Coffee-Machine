package machine;
import java.util.Scanner;

public class CoffeeMachine {
    
    final static Scanner scanner = new Scanner(System.in);
    
    static int waterQuantity = 400;
    static int milkQuantity = 540;
    static int coffeeBeansQuantity = 120;
    static int cupsDisposable = 9;
    static int money = 550;
    
    
    public static void main(String[] args) {
        
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();
            System.out.println();
            
            switch (action) {
                case "buy":
                buy();
                break;

                case "fill":
                    fill();
                    break;

                case "take":
                    take();
                    break;

                case "remaining":
                    remaining();
                    break;

                case "exit":
                    return;
            }
   
        }
            
    }
    
    public static void buy() {
        
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String choice = scanner.nextLine();
        
        switch (choice) {
            case "1":
                if (waterQuantity < 250) {
                    System.out.println("Sorry, not enough water!");
                } else if (coffeeBeansQuantity < 16) {
                    System.out.println("Sorry, not enough beans!");
                } else if (cupsDisposable < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    waterQuantity -= 250;
                    coffeeBeansQuantity -= 16;
                    cupsDisposable--;
                    money += 4;
                }
                break;
                
            case "2":
                if (waterQuantity < 350) {
                    System.out.println("Sorry, not enough water!");
                } else if (milkQuantity < 75) {
                    System.out.println("Sorry, not enough milk!");
                } else if (coffeeBeansQuantity < 20) {
                    System.out.println("Sorry, not enough beans!");
                } else if (cupsDisposable < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    waterQuantity -= 350;
                    milkQuantity -= 75;
                    coffeeBeansQuantity -= 20;
                    cupsDisposable--;
                    money += 7;
                }
                break;
                
                
            case "3":
                if (waterQuantity < 200) {
                    System.out.println("Sorry, not enough water!");
                } else if (milkQuantity < 100) {
                    System.out.println("Sorry, not enough milk!");
                } else if (coffeeBeansQuantity < 12) {
                    System.out.println("Sorry, not enough beans!");
                } else if (cupsDisposable < 1) {
                    System.out.println("Sorry, not enough disposable cups!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    waterQuantity -= 200;
                    milkQuantity -= 100;
                    coffeeBeansQuantity -= 12;
                    cupsDisposable--;
                    money += 6;
                }
                break;
                
            case "back":
                break; 
        }
            
    }
    
    public static void fill() {
        System.out.println("Write how many ml of water you want to add:");
        waterQuantity += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milkQuantity += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffeeBeansQuantity += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        cupsDisposable += scanner.nextInt();
        
        scanner.nextLine();
        System.out.println();
    }
    
    public static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
        System.out.println();
    }
    
    public static void remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(waterQuantity + " ml of water");
        System.out.println(milkQuantity + " ml of milk");
        System.out.println(coffeeBeansQuantity + " g of coffee beans");
        System.out.println(cupsDisposable + " disposable cups");
        System.out.println("$" + money + " of money");
    }
    
}
