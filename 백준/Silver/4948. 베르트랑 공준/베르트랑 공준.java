import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            boolean[] primeNumber = new boolean[((n * 2) + 1)];
            primeNumber[0] = primeNumber[1] = true;
            for (int i = 2; i <= Math.sqrt(primeNumber.length); i++) {
                if (primeNumber[i]) continue;
                for (int j = (i * i); j < primeNumber.length; j += i) {
                    primeNumber[j] = true;
                }
            }

            int count = 0;
            for (int i = (n + 1); i <= (n * 2); i++) {
                if (!primeNumber[i]) count++;
            }
            sb.append(count).append("\n");
        }
        System.out.print(sb);
    }
}