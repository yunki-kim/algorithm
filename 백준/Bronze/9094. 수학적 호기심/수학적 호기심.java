import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int count = 0;

            for (int j = 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (((j * j) + (k * k) + m) % (j * k) == 0) count++;
                }
            }
            sb.append(count).append("\n");
        }
        br.close();
        System.out.print(sb);
    }
}