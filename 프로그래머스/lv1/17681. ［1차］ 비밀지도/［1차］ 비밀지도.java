class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String orBinary = Integer.toBinaryString(arr1[i] | arr2[i]);

            String blank = "";
            if (orBinary.length() < n) {
                for (int j = orBinary.length(); j < n; j++) {
                    blank += "0";
                }
            }
            orBinary = blank + orBinary;
            orBinary = orBinary.replace("1", "#");
            orBinary = orBinary.replace("0", " ");
            answer[i] = orBinary;
        }
        return answer;
    }
}