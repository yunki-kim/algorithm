import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] numbers = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < numbers.length; j++) {
                numbers[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(numbers);
            sb.append(numbers[0]).append(" ").append(numbers[numbers.length - 1]).append("\n");
        }

        System.out.print(sb);
        br.close();
    }
}
