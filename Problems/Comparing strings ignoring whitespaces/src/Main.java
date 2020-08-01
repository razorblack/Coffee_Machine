import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine().trim();
        String input2 = scanner.nextLine().trim();
        input1 = input1.replace(" ", "");
        input2 = input2.replace(" ", "");
        System.out.println(input1.equals(input2));

    }
}