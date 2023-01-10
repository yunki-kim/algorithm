import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String S = br.readLine();
            if (S.equals("0")) break;

            sb.append(isPalindrome(S) ? "yes": "no").append("\n");
        }
        br.close();
        System.out.print(sb);
    }

    static boolean isPalindrome(String s) {
        if (s.length() == 1) return true;
        for (int i = 0; i < (s.length() / 2); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
        }
        return true;
    }
}