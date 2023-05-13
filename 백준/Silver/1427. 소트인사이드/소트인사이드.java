import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String iStr = br.readLine();

        int[] iArr = new int[iStr.length()];
        for (int i = 0; i < iStr.length(); i++) {
            iArr[i] = Integer.parseInt(iStr.substring(i, i + 1));
        }

        // 삽입 정렬을 이용한 내림차순 정렬
        for (int i = 0; i < iStr.length(); i++) {
            int max = i;
            for (int j = i + 1; j < iStr.length(); j++) {
                if (iArr[j] > iArr[max]) {
                    max = j;
                }
            }
            if (iArr[i] < iArr[max]) {
                int temp = iArr[i];
                iArr[i] = iArr[max];
                iArr[max] = temp;
            }
        }

        // 출력
        for (int i = 0; i < iStr.length(); i++) {
            System.out.print(iArr[i]);
        }
    }
}