class Solution {
    public int solution(int chicken) {
        final int BONUS_COUNT = 10;
        int answer = 0;

        while (chicken >= BONUS_COUNT) {
            int bonusChicken = chicken / BONUS_COUNT;
            int ateChicken = chicken % BONUS_COUNT;
            chicken = bonusChicken + ateChicken;

            answer += bonusChicken;
        }
        return answer;
    }
}