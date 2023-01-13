import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] scores = new int[5];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(scores);

        StringBuilder sb = new StringBuilder();
        sb.append((int) (Arrays.stream(scores).average().getAsDouble())).append("\n");
        sb.append(scores[2]);
        System.out.print(sb);
    }
}