import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c >= 97) {
                sb.append((char)(c - 32));
            } else {
                sb.append((char)(c + 32));
            }
        }
        System.out.println(sb);
    }
}