import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] line = new int[N];
        for (int i = 0; i < N; i++) {
            line[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(line);

        int[] sumArray = new int[N];
        sumArray[0] = line[0];
        for (int i = 1; i < N; i++) {
            sumArray[i] = sumArray[i - 1] + line[i];
        }
        System.out.println(Arrays.stream(sumArray).sum());
    }
}