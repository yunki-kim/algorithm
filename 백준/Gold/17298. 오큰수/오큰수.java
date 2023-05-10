import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] iArr = new int[N];
        int[] rArr = new int[N];

        String[] iStr = br.readLine().split(" ");
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = Integer.parseInt(iStr[i]);
        }
        br.close();

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < N; i++) {
            // 스택이 비어있지 않고 현재 수열이 스택의 top 인덱스가 가리키는 수열보다 큰 경우
            while (!stack.empty() && iArr[stack.peek()] < iArr[i]) {
                rArr[stack.pop()] = iArr[i];
            }
            stack.push(i);
        }

        while (!stack.empty()) {
            // 스택에 남아있는 인덱스의 수열 값은 오큰수가 없으므로 -1 저장
            rArr[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int num : rArr) {
            sb.append(num).append(" ");
        }
        System.out.println(sb);
    }
}