import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] primeNumber = new boolean[(N + 1)];
        primeNumber[0] = true;
        primeNumber[1] = true;
        for (int i = 2; i <= Math.sqrt(primeNumber.length); i++) {
            if (primeNumber[i]) continue;
            for (int j = (i * i); j < primeNumber.length; j += i) {
                primeNumber[j] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = M; i <= N; i++) {
            if (!primeNumber[i]) sb.append(i).append("\n");
        }
        System.out.print(sb);
    }
}