import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int height = scanner.nextInt();
        int daydis = scanner.nextInt();
        int nightdis = scanner.nextInt();
        int days = 1;
        int distance = daydis;
        for (; height > distance; distance += daydis) {
            days++;
            distance += -nightdis;
        }
        System.out.println(days);

    }
}
