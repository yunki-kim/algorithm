import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static long[] dp = new long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            sb.append(pado(Integer.parseInt(br.readLine()))).append("\n");
        }
        br.close();
        System.out.print(sb);
    }

    public static long pado(int n) {
        if (n == 1 || n == 2 || n == 3) return 1;
        if (dp[n] != 0) return dp[n];

        dp[n] = pado(n - 3) + pado(n - 2);

        return dp[n];
    }
}
