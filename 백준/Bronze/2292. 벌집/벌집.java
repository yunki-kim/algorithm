import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();

        int count = 0;
        if (N == 1) {
            count = 1;
        } else {
            while (N > 1) {
                N -= (6 * count);
                count++;
            }
        }
        System.out.println(count);
    }
}