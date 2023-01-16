import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] serialArray = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            serialArray[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        Arrays.sort(serialArray);

        int pointerI = 0;
        int pointerJ = serialArray.length - 1;
        int count = 0;
        while (pointerJ > pointerI) {
            if (serialArray[pointerI] + serialArray[pointerJ] == M) {
                count++;
                pointerI++;
                pointerJ--;
            } else if (serialArray[pointerI] + serialArray[pointerJ] > M) pointerJ--;
            else pointerI++;
        }
        System.out.println(count);
    }
}