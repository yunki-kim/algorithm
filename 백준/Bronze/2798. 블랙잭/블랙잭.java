import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] cardList = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < cardList.length; i++) {
            cardList[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(searchCard(cardList, N, M));
    }

    public static int searchCard(int[] array, int N, int M) {
        int result = 0;
        for (int i = 0; i < (N - 2); i++) {
            for (int j = (i + 1); j < (N - 1); j++) {
                for (int k = (j + 1); k < N; k++) {
                    int temp = array[i] + array[j] + array[k];
                    if (M == temp) return temp;
                    if (result < temp && temp < M) result = temp;
                }
            }
        }
        return result;
    }
}