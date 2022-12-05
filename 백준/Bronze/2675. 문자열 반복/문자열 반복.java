import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스 개수 입력

        for (int i = 0; i < T; i++) {
            StringBuilder builder = new StringBuilder();
            int R = scanner.nextInt(); // 테스트 케이스 반복횟수 입력
            String S = scanner.next(); // 입력받을 문자열

            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    builder.append(S.charAt(j));
                }
            }
            String P = builder.toString(); // 결과 문자열
            System.out.println(P);
        }
    }
}