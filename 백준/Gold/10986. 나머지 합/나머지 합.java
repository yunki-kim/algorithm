import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] sumArray = new long[N];
        long[] remainderArray = new long[M];
        long count = 0;

        st = new StringTokenizer(br.readLine());
        sumArray[0] = Integer.parseInt(st.nextToken());
        for (int i = 1; i < sumArray.length; i++) {
            sumArray[i] = sumArray[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (long value : sumArray) {
            int remainder = (int) (value % M);

            if (remainder == 0) count++;
            remainderArray[remainder]++;
        }

        for (long value : remainderArray) {
            if (value > 1) count += (value * (value - 1)) / 2;
        }
        System.out.println(count);
    }
}