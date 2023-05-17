import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int[] iArr;
    public static int[] tArr;
    public static long result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        iArr = new int[N + 1];
        tArr = new int[N + 1];
        result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            iArr[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(1, N);
        System.out.println(result);
    }

    private static void mergeSort(int start, int end) {
        if (end - start < 1) {
            return;
        }

        int middle = start + ((end - start) / 2);
        mergeSort(start, middle);
        mergeSort(middle + 1, end);

        for (int i = start; i <= end; i++) {
            tArr[i] = iArr[i];
        }

        int k = start;
        int index1 = start;
        int index2 = middle + 1;
        while (index1 <= middle && index2 <= end) {
            if (tArr[index1] > tArr[index2]) {
                iArr[k] = tArr[index2];
                result += index2 - k; // swap 카운트
                k++;
                index2++;
            } else {
                iArr[k] = tArr[index1];
                k++;
                index1++;
            }
        }

        while (index1 <= middle) {
            iArr[k] = tArr[index1];
            k++;
            index1++;
        }

        while (index2 <= end) {
            iArr[k] = tArr[index2];
            k++;
            index2++;
        }
    }
}