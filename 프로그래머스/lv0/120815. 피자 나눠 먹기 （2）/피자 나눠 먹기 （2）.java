class Solution {
    public int solution(int n) {
        int slice = 6;
        int lcm = (n * slice) / gcd(n, 6);
        return lcm / slice;
    }

    public static int gcd(int a, int b) {
        if (a <= b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (b == 0) {
            return a;
        }

        return gcd(b, (a % b));
    }
}