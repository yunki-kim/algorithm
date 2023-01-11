import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dotsX = new int[3];
        int[] dotsY = new int[3];
        int resultX;
        int resultY;

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            dotsX[i] = Integer.parseInt(st.nextToken());
            dotsY[i] = Integer.parseInt(st.nextToken());
        }

        if (dotsX[0] == dotsX[1]) resultX = dotsX[2];
        else resultX = (dotsX[0] == dotsX[2]) ? dotsX[1] : dotsX[0];

        if (dotsY[0] == dotsY[1]) resultY = dotsY[2];
        else resultY = (dotsY[0] == dotsY[2]) ? dotsY[1] : dotsY[0];

        System.out.println(resultX + " " + resultY);
    }
}