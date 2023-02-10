import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer sub = new StringTokenizer(br.readLine(), "-");
        int sum = Integer.MIN_VALUE;
        while (sub.hasMoreTokens()) {
            int temp = 0;

            StringTokenizer add = new StringTokenizer(sub.nextToken(), "+");
            while (add.hasMoreTokens()) temp += Integer.parseInt(add.nextToken());

            if (sum == Integer.MIN_VALUE) sum = temp;
            else sum -= temp;
        }
        br.close();
        System.out.println(sum);
    }
}