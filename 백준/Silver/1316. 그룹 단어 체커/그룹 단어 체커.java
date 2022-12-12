import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (groupWordCheck()) count++;
        }
        System.out.println(count);
        br.close();
    }

    public static boolean groupWordCheck() throws IOException {
        boolean[] alphabets = new boolean[26];
        String input = br.readLine();
        int word, prevWord = 0;

        for (int i = 0; i < input.length(); i++) {
            word = input.charAt(i);
            if (word == prevWord) continue;
            if (alphabets[word - 'a']) return false;

            alphabets[word - 'a'] = true;
            prevWord = word;
        }
        return true;
    }
}