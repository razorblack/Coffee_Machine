package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static int stockWater = 400;
    private static int stockMilk = 540;
    private static int stockCoco = 120;
    private static int stockCoffeeCups = 9;
    private static int stockMoney = 550;
    private static String userAction = "";
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        

        do {
            action();
        } while (!"exit".equals(userAction));


    }
    public static void machineState() {

        System.out.println("The coffee machine has:");
        System.out.println(stockWater + " of water");
        System.out.println(stockMilk + " of milk");
        System.out.println(stockCoco + " of coffee beans");
        System.out.println(stockCoffeeCups + " of disposable cups");
        System.out.println("$" + stockMoney + " of money");
        System.out.println();
    }
    public static void action() {

        System.out.println("Write an action (buy, fill, take, remaining, exit):");
        userAction = scanner.next();
        System.out.println();
        if ("buy".equals(userAction)) {
            buy();
        } else if ("fill".equals(userAction)) {
            fill();
        } else if ("take".equals(userAction)) {
            take();
        } else if ("remaining".equals(userAction)) {
            machineState();
        }
    }
    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String choiceOfCoffee = scanner.next();
        if ("1".equals(choiceOfCoffee)) {
            // Espresso Processing
            if (checkResource(choiceOfCoffee)) {
                stockWater -= 250;
                stockCoco -= 16;
                stockMoney += 4;
                stockCoffeeCups -= 1;
                System.out.println("I have enough resources, making you a coffee!");
            }

        } else if ("2".equals(choiceOfCoffee)) {
            // Latte Processing
            if (checkResource(choiceOfCoffee)) {
                stockWater -= 350;
                stockMilk -= 75;
                stockCoco -= 20;
                stockMoney += 7;
                stockCoffeeCups -= 1;
                System.out.println("I have enough resources, making you a coffee!");

            }
        } else if ("3".equals(choiceOfCoffee)) {
            // Cappuccino Processing
            if (checkResource(choiceOfCoffee)) {
                stockWater -= 200;
                stockMilk -= 100;
                stockCoco -= 12;
                stockMoney += 6;
                stockCoffeeCups -= 1;
                System.out.println("I have enough resources, making you a coffee!");
            }
        } else {
            action();
        }
        System.out.println();

    }
    public static void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        int addToStockWater = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int addToStockMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int addToStockCoco = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int addToStockCoffeeCups = scanner.nextInt();
        stockWater += addToStockWater;
        stockMilk += addToStockMilk;
        stockCoco += addToStockCoco;
        stockCoffeeCups += addToStockCoffeeCups;

    }
    public static void take() {
        System.out.println("I gave you $" + stockMoney);
        stockMoney = 0;
        System.out.println();

    }
    public static boolean checkResource(String choice) {
        switch (choice) {
            case "1" :
                if (stockWater >= 250 && stockCoco >= 16) {
                    return true;
                } else if (stockWater < 250 && stockCoco >= 16) {
                    System.out.println("Sorry, not enough water!");
                } else System.out.println("Sorry, not enough coffee beans");
                break;
            case "2" :
                if (stockWater >= 350 && stockMilk >= 75 && stockCoco >= 20) {
                    return true;
                } else if (stockWater < 350 && stockMilk >= 75 && stockCoco >= 20) {
                    System.out.println("Sorry, not enough water!");
                } else if (stockWater >= 350 && stockMilk < 75 && stockCoco >= 20) {
                    System.out.println("Sorry, not enough milk!");
                } else {
                    System.out.println("Sorry, not enough coffee beans!");
                }
                break;
            case "3" :
                if (stockWater >= 200 && stockMilk >= 100 && stockCoco >= 12) {
                    return true;
                } else if (stockWater < 200 && stockMilk >= 100 && stockCoco >= 12) {
                    System.out.println("Sorry, not enough water!");
                } else if (stockWater >= 200 && stockMilk < 100 && stockCoco >= 12) {
                    System.out.println("Sorry, not enough milk!");
                } else {
                    System.out.println("Sorry, not enough coffee beans!");
                }
                break;
            default: return false;
        }
        return false;

    }
}
