class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) < 97) sb.append((char) (my_string.charAt(i) + 32));
            else sb.append((char) (my_string.charAt(i) - 32));
        }
        return sb.toString();
    }
}