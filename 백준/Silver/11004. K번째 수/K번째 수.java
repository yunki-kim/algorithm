import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] iArr = new int[N];
        for (int i = 0; i < N; i++) {
            iArr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        quickSort(iArr, 0, N - 1, K - 1);
        System.out.println(iArr[K - 1]);
    }

    private static void quickSort(int[] arr, int start, int end, int find) {
        if (start < end) {
            int pivot = partition(arr, start, end);
            if (pivot == find) {
                return; // K번째 수가 pivot이므로 정렬 수행 불필요
            } else if (pivot > find) {
                quickSort(arr, start, pivot - 1, find); // 왼쪽 그룹만 정렬 수행
            } else {
                quickSort(arr, pivot + 1, end, find); // 오른쪽 그룹만 정렬 수행
            }
        }
    }

    private static int partition(int[] arr, int start, int end) {
        if (start + 1 == end) {
            if (arr[start] > arr[end]) {
                swap(arr, start, end);
            } else {
                return end;
            }
        }
        int middle = (start + end) / 2;
        swap(arr, start, middle);

        int pivot = arr[start];
        int i = start + 1;
        int j = end;

        while (i <= j) {
            while (j >= start + 1 && pivot < arr[j]) {
                j--;
            }
            while (i <= end && pivot > arr[i]) {
                i++;
            }
            if (i < j) {
                swap(arr, i++, j--);
            } else {
                break;
            }
        }
        arr[start] = arr[j];
        arr[j] = pivot;
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}