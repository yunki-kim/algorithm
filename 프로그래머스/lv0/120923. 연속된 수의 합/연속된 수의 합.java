class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int middleValue = total / num;
        int startNumber = middleValue - ((total % num == 0) ? num / 2 : (num / 2) - 1);

        for (int i = 0; i < num; i++) {
            answer[i] = startNumber + i;
        }

        return answer;
    }
}