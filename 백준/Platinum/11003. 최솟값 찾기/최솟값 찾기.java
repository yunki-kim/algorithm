import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Node> deque = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(st.nextToken());

            // now 보다 값이 큰 데이터 제거
            while (!deque.isEmpty() && deque.getLast().value > now) {
                deque.removeLast();
            }
            deque.addLast(new Node(i, now));

            // 윈도우 범위를 벗어난 데이터 제거
            if (deque.getFirst().index <= i - L) {
                deque.removeFirst();
            }

            sb.append(deque.getFirst().value).append(" ");
        }
        br.close();
        System.out.println(sb);
    }

    static class Node {
        private int index;
        private int value;

        Node(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}