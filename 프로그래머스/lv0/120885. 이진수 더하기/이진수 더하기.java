class Solution {
    public String solution(String bin1, String bin2) {
        int bin1Int = Integer.parseInt(bin1, 2);
        int bin2Int = Integer.parseInt(bin2, 2);

        return Integer.toBinaryString(addBinary(bin1Int, bin2Int));
    }

    static int addBinary(int a, int b) {
        if (b == 0) return a;

        int sum = a^b;
        int carry = (a&b) << 1;

        return addBinary(sum, carry);
    }
}