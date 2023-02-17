import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder inputString = new StringBuilder(br.readLine());
        String inputWord = br.readLine();

        int count = 0;
        int index;
        while ((index = inputString.toString().indexOf(inputWord)) != -1) {
            count++;
            inputString.delete(0, index + inputWord.length());
        }
        System.out.println(count);
    }
}