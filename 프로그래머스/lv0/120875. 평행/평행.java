import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[][] dots) {
        List<Double> slopes = new ArrayList<>();
        for (int i = 0; i < dots.length; i++) {
            for (int j = (i + 1); j < dots.length; j++) {
                double slope = (double) (dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]);
                if (slopes.contains(slope)) return 1;

                slopes.add(slope);
            }
        }
        return 0;
    }
}