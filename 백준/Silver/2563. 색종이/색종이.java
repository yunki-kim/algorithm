import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[][] backgroundArray = new boolean[100][100];

        int paperCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < paperCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = x; j < (x + 10); j++) {
                for (int k = y; k < (y + 10); k++) {
                    backgroundArray[j][k] = true;
                }
            }
        }
        br.close();

        int count = 0;
        for (boolean[] array : backgroundArray) {
            for (boolean check : array) {
                if (check) count++;
            }
        }
        System.out.println(count);
    }
}