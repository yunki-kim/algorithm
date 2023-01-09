import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int hasLongSide = sides[1] - sides[0];
        int hasNotLongSide = sides[1] + sides[0];

        return hasNotLongSide - hasLongSide - 1;
    }
}