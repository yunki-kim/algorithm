import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] inputCheckArr = new int[4];
    static int[] checkArr = new int[4];
    static int checkCount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char[] inputArr = br.readLine().toCharArray();

        checkCount = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());

            if (checkArr[i] == 0) checkCount++;
        }
        br.close();

        int resultCount = 0;
        for (int i = 0; i < P; i++) {
            add(inputArr[i]);
        }
        if (checkCount == 4) resultCount++;

        for (int i = P; i < S; i++) {
            int j = i - P;
            add(inputArr[i]);
            remove(inputArr[j]);

            if (checkCount == 4) resultCount++;
        }
        System.out.println(resultCount);
    }

    private static void add(char value) {
        switch (value) {
            case 'A':
                inputCheckArr[0]++;
                if (inputCheckArr[0] == checkArr[0]) checkCount++;
                break;

            case 'C':
                inputCheckArr[1]++;
                if (inputCheckArr[1] == checkArr[1]) checkCount++;
                break;

            case 'G':
                inputCheckArr[2]++;
                if (inputCheckArr[2] == checkArr[2]) checkCount++;
                break;

            case 'T':
                inputCheckArr[3]++;
                if (inputCheckArr[3] == checkArr[3]) checkCount++;
                break;
        }
    }

    private static void remove(char value) {
        switch (value) {
            case 'A':
                if (inputCheckArr[0] == checkArr[0]) checkCount--;
                inputCheckArr[0]--;
                break;

            case 'C':
                if (inputCheckArr[1] == checkArr[1]) checkCount--;
                inputCheckArr[1]--;
                break;

            case 'G':
                if (inputCheckArr[2] == checkArr[2]) checkCount--;
                inputCheckArr[2]--;
                break;

            case 'T':
                if (inputCheckArr[3] == checkArr[3]) checkCount--;
                inputCheckArr[3]--;
                break;
        }
    }
}