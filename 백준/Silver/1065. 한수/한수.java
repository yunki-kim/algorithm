import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(ariSequence(Integer.parseInt(br.readLine())));
        br.close();
    }

    private static int ariSequence(int N) {
        int count;
        if (N < 100) {
            return N;
        } else {
            count = 99;
            for (int i = 100; i < (N + 1); i++) {
                int hundred = (i / 100);
                int tens = (i / 10) % 10;
                int ones = (i % 10);

                if ((hundred - tens) == (tens - ones)) count++;
            }
        }
        return count;
    }
}