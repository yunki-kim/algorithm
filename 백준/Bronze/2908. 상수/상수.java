import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        num1 = Integer.parseInt(new StringBuilder().append(num1).reverse().toString());
        num2 = Integer.parseInt(new StringBuilder().append(num2).reverse().toString());
        System.out.println(num1 > num2 ? num1 : num2);
    }
}