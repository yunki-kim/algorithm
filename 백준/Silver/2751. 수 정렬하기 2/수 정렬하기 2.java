import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int[] iArr;
    public static int[] tArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        iArr = new int[N + 1];
        tArr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            iArr[i] = Integer.parseInt(br.readLine());
        }
        mergeSort(1, N);

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(iArr[i]).append("\n");
        }
        System.out.print(sb);
    }

    // 병합 정렬 구현
    private static void mergeSort(int start, int end) {
        if (end - start < 1) {
            return;
        }

        // 재귀형태로 호출
        int middle = start + ((end - start) / 2);
        mergeSort(start, middle);
        mergeSort(middle + 1, end);
        for (int i = start; i <= end; i++) {
            tArr[i] = iArr[i];
        }

        int k = start;
        int index1 = start;
        int index2 = middle + 1;

        // 병합 로직
        while (index1 <= middle && index2 <= end) {
            // 두 그룹의 index가 가리키는 값을 비교해 작은 값을 배열에 저장하고 해당 그룹의 포인터 우측으로 이동
            if (tArr[index1] > tArr[index2]) {
                iArr[k] = tArr[index2];
                k++;
                index2++;
            } else {
                iArr[k] = tArr[index1];
                k++;
                index1++;
            }
        }

        // 오른쪽 그룹이 다 선택된 경우 남아있는 왼쪽 그룹 정리
        while (index1 <= middle) {
            iArr[k] = tArr[index1];
            k++;
            index1++;
        }

        // 왼쪽 그룹이 다 선택된 경우 남아있는 오른쪽 그룹 정리
        while (index2 <= end) {
            iArr[k] = tArr[index2];
            k++;
            index2++;
        }
    }
}