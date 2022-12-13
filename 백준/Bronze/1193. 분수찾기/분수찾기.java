import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        br.close();

        int layer = 1;
        int count = 0;
        int top, bottom;
        while (true) {
            if (X <= layer + count) break;
            count += layer;
            layer++;
        }

        int index = X - count;
        if (layer % 2 == 1) {
            top = layer - (index - 1);
            bottom = index;
        } else {
            top = index;
            bottom = layer - (index - 1);
        }
        System.out.println(top + "/" + bottom);
    }
}