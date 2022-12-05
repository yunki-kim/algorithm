import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCaseCount = Integer.parseInt(br.readLine());
        String[] input = new String[testCaseCount];

        for (int i = 0; i < testCaseCount; i++) {
            input[i] = br.readLine();
            int continueCount = 0;
            int score = 0;
            for (int j = 0; j < input[i].length(); j++) {
                if (input[i].charAt(j) == 'O') {
                    continueCount++;
                } else {
                    continueCount = 0;
                }
                score += continueCount;
            }
            sb.append(score + "\n");
        }
        System.out.print(sb);
    }
}