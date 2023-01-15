import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int startIndex = 1;
        int endIndex = 1;
        int sum = 1;
        int count = 1;

        while (endIndex != N) {
            if (sum == N) {
                endIndex++;
                sum += endIndex;
                count++;
            } else if (sum > N) {
                sum -= startIndex;
                startIndex++;
            } else {
                endIndex++;
                sum += endIndex;
            }
        }
        System.out.println(count);
    }
}