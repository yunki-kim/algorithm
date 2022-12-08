import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine());
        for (int i = 0; i < C; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];

            double sum = 0;
            for (int j = 0; j < N; j++) {
                int score = Integer.parseInt(st.nextToken());
                arr[j] = score;
                sum += score;
            }

            double avg = (sum / N);
            double count = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j] > avg) count++;
            }
            
            System.out.printf("%.3f%%\n", ((count / N) * 100));
        }
    }
}