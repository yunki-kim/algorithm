import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        MyData[] iArr = new MyData[N];
        for (int i = 0; i < N; i++) {
            iArr[i] = new MyData(i, Integer.parseInt(br.readLine()));
        }
        Arrays.sort(iArr);

        int max = 0;
        for (int i = 0; i < N; i++) {
            // 정렬 전 index - 정럴 후 index의 max 값 찾기
            if (max < iArr[i].index - i) {
                max = iArr[i].index - i;
            }
        }
        System.out.println(max + 1);
    }

    static class MyData implements Comparable<MyData> {
        private int index;
        private int value;

        public MyData(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(MyData o) {
            return this.value - o.value;
        }
    }
}