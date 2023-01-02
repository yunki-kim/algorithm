import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static boolean[] primeNumber = new boolean[10001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        searchPrimeNumber();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int input = Integer.parseInt(br.readLine());
            int a = input / 2;
            int b = input / 2;

            while (true) {
                if (!primeNumber[a] && !primeNumber[b]) {
                    sb.append(a).append(" ").append(b).append("\n");
                    break;
                }
                a--;
                b++;
            }
        }
        br.close();
        System.out.print(sb);
    }

    static void searchPrimeNumber() {
        primeNumber[0] = primeNumber[1] = true;
        for (int i = 2; i <= Math.sqrt(primeNumber.length); i++) {
            if (primeNumber[i]) continue;
            for (int j = (i * i); j < primeNumber.length; j += i) {
                primeNumber[j] = true;
            }
        }
    }
}