import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alphabets = new int[26];
        String input = (br.readLine()).toUpperCase();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                alphabets[input.charAt(i) - 'A']++;
            }
        }

        int max = 0;
        char alphabet = '?';
        for (int i = 0; i < alphabets.length; i++) {
            if (alphabets[i] > max) {
                max = alphabets[i];
                alphabet = (char) (i + 65);
            } else if (alphabets[i] == max) {
                alphabet = '?';
            }
        }
        System.out.println(alphabet);
    }
}