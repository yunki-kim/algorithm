import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] alphabets = new int[26];
        Arrays.fill(alphabets, -1);

        String input = br.readLine();
        br.close();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (alphabets[ch - 'a'] == -1) {
                alphabets[ch - 'a'] = i;
            }
        }

        for (int number : alphabets) {
            sb.append(number).append(" ");
        }
        System.out.println(sb);
    }
}