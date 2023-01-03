class Solution {
    public int solution(String my_string) {
        String[] arrayStr = my_string.split(" ");
        int result = 0;
        boolean plusFlag = true;
        for (int i = 0; i < arrayStr.length; i++) {
            if (i % 2 == 0) {
                if (plusFlag) result += Integer.parseInt(arrayStr[i]);
                else result -= Integer.parseInt(arrayStr[i]);
            } else {
                plusFlag = arrayStr[i].equals("+");
            }
        }
        return result;
    }
}