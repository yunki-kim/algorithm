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

        int[][] inputArray = new int[N + 1][N + 1];
        for (int i = 1; i < inputArray.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < inputArray[i].length; j++) {
                inputArray[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] sumArray = new int[N + 1][N + 1];
        for (int i = 1; i < sumArray.length; i++) {
            for (int j = 1; j < sumArray[i].length; j++) {
                sumArray[i][j] = sumArray[i][j - 1] + sumArray[i - 1][j] - sumArray[i - 1][j - 1] + inputArray[i][j];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            sb.append(sumArray[x2][y2] - sumArray[x1 - 1][y2] - sumArray[x2][y1 - 1] + sumArray[x1 -1][y1 - 1])
                    .append("\n");
        }
        br.close();
        System.out.print(sb);
    }
}
