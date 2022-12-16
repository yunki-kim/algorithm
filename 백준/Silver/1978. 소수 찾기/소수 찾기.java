import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();

        int count = 0;
        for (int i = 0; i < N; i++) {
            boolean flag = true;
            int number = Integer.parseInt(st.nextToken());

            if (number == 1) flag = false;
            for (int j = 2; j < number; j++) {
                if (number % j == 0) flag = false;
            }
            if (flag) count++;
        }
        System.out.println(count);
    }
}