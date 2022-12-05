import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int number = N;
        int cycle = 0;

        while (true) {
            N = (((N / 10) + (N % 10)) % 10) + ((N % 10) * 10);
            cycle++;
            if (number == N) break;
        }
        System.out.println(cycle);
    }
}