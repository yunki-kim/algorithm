import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        MyStack stack = new MyStack();
        int value = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if (order.equals("push")) {
                value = Integer.parseInt(st.nextToken());
            }

            switch (order) {
                case "push":
                    stack.push(value);
                    break;

                case "pop":
                    sb.append(stack.pop()).append("\n");
                    break;

                case "size":
                    sb.append(stack.size()).append("\n");
                    break;

                case "empty":
                    sb.append(stack.empty() ? 1 : 0).append("\n");
                    break;

                case "top":
                    sb.append(stack.top()).append("\n");
                    break;
            }
        }
        System.out.print(sb);
    }

    static class MyStack {
        private List<Integer> list = new ArrayList<>();

        void push(int value) {
            list.add(value);
        }

        int pop() {
            if (list.isEmpty()) return -1;

            return list.remove(list.size() - 1);
        }

        int size() {
            return list.size();
        }

        boolean empty() {
            return list.isEmpty();
        }

        int top() {
            if (list.isEmpty()) return -1;
            return list.get(list.size() - 1);
        }
    }
}