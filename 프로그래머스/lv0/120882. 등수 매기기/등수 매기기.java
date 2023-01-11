import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[] solution(int[][] score) {
        List<Integer> sumScoreList = new ArrayList<>();
        for (int[] s : score) {
            sumScoreList.add(s[0] + s[1]);
        }
        sumScoreList.sort(Comparator.reverseOrder());

        int[] result = new int[score.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = sumScoreList.indexOf(score[i][0] + score[i][1]) + 1;
        }
        return result;
    }
}