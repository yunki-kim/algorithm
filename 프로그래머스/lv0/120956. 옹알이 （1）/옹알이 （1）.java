class Solution {
    public int solution(String[] babbling) {
        String[] says = {"aya", "ye", "woo", "ma"};
        int count = 0;
        StringBuilder blank = new StringBuilder();
        for (String word : babbling) {
            for (String say : says) {
                if (word.contains(say)) {
                    word = word.replace(say, " ");
                    blank.append(" ");
                }

                if (word.equals(blank.toString())) {
                    count++;
                    break;
                }
            }
            blank.setLength(0);
        }
        return count;
    }
}