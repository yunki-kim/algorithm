import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int count = 0;

        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            if (!input[i].equals("")) {
                count++;
            }
        }
        System.out.println(count);
    }
}