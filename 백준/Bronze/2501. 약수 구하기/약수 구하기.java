import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int number = Integer.parseInt(st.nextToken());
        int index = Integer.parseInt(st.nextToken()) - 1;

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                list.add(i);
                if (number / i != i) list.add(number / i);
            }
        }
        Collections.sort(list);

        System.out.println(list.size() > index ? list.get(index) : "0");
    }
}