import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
        char[] charsB = b.toCharArray();

        System.out.println(a * (charsB[2] - '0'));
        System.out.println(a * (charsB[1] - '0'));
        System.out.println(a * (charsB[0] - '0'));
        System.out.println(a * Integer.parseInt(b));
        br.close();
    }
}