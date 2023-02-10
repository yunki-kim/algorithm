import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] distances = new long[N - 1];
        for (int i = 0; i < distances.length; i++) {
            distances[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        long[] prices = new long[N];
        for (int i = 0; i < prices.length; i++) {
            prices[i] = Long.parseLong(st.nextToken());
        }

        long minTotalPrice = 0;
        long minPrice = prices[0];

        for (int i = 0; i < distances.length; i++) {
            if (prices[i] < minPrice) minPrice = prices[i];

            minTotalPrice += distances[i] * minPrice;
        }
        System.out.println(minTotalPrice);
    }
}