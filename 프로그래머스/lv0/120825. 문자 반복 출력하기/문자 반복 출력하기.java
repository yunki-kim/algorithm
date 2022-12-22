class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        String[] strArray = my_string.split("");
        for (int i = 0; i < my_string.length(); i++) {
            sb.append(strArray[i].repeat(n));
        }
        return sb.toString();
    }
}