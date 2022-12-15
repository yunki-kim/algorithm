import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();

        String stringA = st.nextToken();
        String stringB = st.nextToken();
        int length = Math.max(stringA.length(), stringB.length());

        int[] arrayA = new int[(length + 1)];
        int[] arrayB = new int[(length + 1)];

        for (int i = (stringA.length() - 1), index = 0; i >= 0; i--, index++) {
            arrayA[index] = stringA.charAt(i) - '0';
        }

        for (int i = (stringB.length() - 1), index = 0; i >= 0; i--, index++) {
            arrayB[index] = stringB.charAt(i) - '0';
        }

        for (int i = 0; i < length; i++) {
            int sum = arrayA[i] + arrayB[i];
            arrayA[i] = sum % 10;
            arrayA[(i + 1)] += sum / 10;
        }

        StringBuilder sb = new StringBuilder();
        if (arrayA[length] != 0) sb.append(arrayA[length]);
        for (int i = (length - 1); i >= 0; i--) {
            sb.append(arrayA[i]);
        }
        System.out.println(sb);
    }
}