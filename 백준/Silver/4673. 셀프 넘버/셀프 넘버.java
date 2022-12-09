public class Main {
    public static void main(String[] args) {
        boolean[] notSelfNumbers = new boolean[10001];

        for (int i = 1; i < 10001; i++) {
            int sum = d(i);
            if (sum < 10001) {
                notSelfNumbers[sum] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < notSelfNumbers.length; i++) {
            if (!notSelfNumbers[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static int d(int n) {
        int sum = n;

        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }
}