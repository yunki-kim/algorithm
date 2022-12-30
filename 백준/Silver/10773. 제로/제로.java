import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int K = Integer.parseInt(br.readLine());
        for (int i = 0; i < K; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input == 0) stack.pop();
            else stack.push(input);
        }
        br.close();

        int sum = 0;
        for (int value : stack) sum += value;

        System.out.println(sum);
    }
}
