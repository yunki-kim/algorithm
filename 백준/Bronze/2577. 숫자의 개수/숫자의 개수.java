import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        br.close();

        int number = A * B * C;
        int[] countArray = new int[10];
        while (number > 0) {
            countArray[(number % 10)]++;
            number /= 10;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= (countArray.length - 1); i++) {
            sb.append(countArray[i]).append("\n");
        }
        System.out.print(sb);
    }
}