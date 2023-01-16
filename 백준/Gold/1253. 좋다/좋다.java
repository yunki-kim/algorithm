import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numberArray = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        Arrays.sort(numberArray);

        int count = 0;
        for (int k = 0; k < numberArray.length; k++) {
            long findNumber = numberArray[k];
            int pointerI = 0;
            int pointerJ = numberArray.length - 1;
            while (pointerI < pointerJ) {
                if (numberArray[pointerI] + numberArray[pointerJ] == findNumber) {
                    if (pointerI != k && pointerJ != k) {
                        count++;
                        break;
                    } else if (pointerI == k) pointerI++;
                    else pointerJ--;

                } else if (numberArray[pointerI] + numberArray[pointerJ] > findNumber) pointerJ--;
                else pointerI++;
            }
        }
        System.out.println(count);
    }
}
