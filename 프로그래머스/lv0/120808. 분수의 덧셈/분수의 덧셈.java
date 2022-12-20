import java.util.Arrays;

class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int top = (denum1 * num2) + (denum2 * num1);
        int bottom = num1 * num2;

        int divisor = gcd(top, bottom);
        answer[0] = top / divisor;
        answer[1] = bottom / divisor;

        return answer;
    }

    public static int gcd(int a, int b) {
        if (a <= b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b == 0) return  a;

        return gcd(b, (a % b));
    }
}