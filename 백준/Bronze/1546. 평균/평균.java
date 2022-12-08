import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double[] arr = new double[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(arr);

        double sum = 0;
        for (double score : arr) {
            sum += (score / arr[(arr.length - 1)]) * 100;
        }

        System.out.println(sum / arr.length);
    }
}