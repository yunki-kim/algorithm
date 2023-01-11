import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] numlist, int n) {
        return IntStream.of(numlist).boxed().sorted((num1, num2) -> {
            int num1Abs = Math.abs(num1 - n);
            int num2Abs = Math.abs(num2 - n);

            if (num1Abs == num2Abs) return num1 > num2 ? -1 : 1;
            else return num1Abs - num2Abs;
        }).mapToInt(Integer::intValue).toArray();
    }
}
