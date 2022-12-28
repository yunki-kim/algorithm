import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        br.close();

        StringBuilder sb = new StringBuilder();
        int resultGCD = gcd(a, b);
        int resultLCM = lcm((a * b), resultGCD);
        sb.append(resultGCD).append("\n");
        sb.append(resultLCM);

        System.out.println(sb);
    }

    public static int gcd(int a, int b) {
        if (a <= b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (b == 0) return a;
        return gcd (b, (a % b));
    }

    public static int lcm(int number, int gcd) {
        return number / gcd;
    }
}