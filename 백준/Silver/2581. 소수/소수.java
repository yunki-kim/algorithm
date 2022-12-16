import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        boolean[] primeNumber = new boolean[(N + 1)];
        primeNumber[0] = true;
        primeNumber[1] = true;
        for (int i = 2; i <= Math.sqrt(primeNumber.length); i++) {
            if (primeNumber[i]) continue;
            for (int j = (i * i); j < primeNumber.length; j += i) {
                primeNumber[j] = true;
            }

        }

        int sum = 0;
        int min = -1;
        for (int i = M; i <= N; i++) {
            if (!primeNumber[i]) {
                sum += i;
                if (min == -1) min = i;
            }
        }
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}