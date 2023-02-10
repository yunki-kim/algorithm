import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        br.close();
        StringTokenizer stringByZero = new StringTokenizer(input, "0");
        StringTokenizer stringByOne = new StringTokenizer(input, "1");

        int count = Math.min(stringByZero.countTokens(), stringByOne.countTokens());
        System.out.println(count);
    }
}