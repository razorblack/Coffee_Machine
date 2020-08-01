import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int duration = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int hotelCost = scanner.nextInt();
        int totalCost = ( flightCost * 2 ) + ( foodCost * duration ) + ( hotelCost * ( duration-1 ));
        System.out.println(totalCost);

    }
}