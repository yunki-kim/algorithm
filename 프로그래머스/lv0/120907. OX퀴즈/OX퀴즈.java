class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] question = quiz[i].split(" ");
            int x = Integer.parseInt(question[0]);
            int y = Integer.parseInt(question[2]);
            int z = Integer.parseInt(question[4]);

            if (question[1].equals("+")) answer[i] = x + y == z ? "O" : "X";
            else answer[i] = x - y == z ? "O" : "X";
        }
        return answer;
    }
}