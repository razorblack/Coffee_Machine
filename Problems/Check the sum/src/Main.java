import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int sum1 = n1 + n2;
        int sum2 = n1 + n3;
        int sum3 = n2 + n3;
        boolean res = sum1 == 20 || sum2 == 20 || sum3 == 20;
        System.out.println(res);
    }
}