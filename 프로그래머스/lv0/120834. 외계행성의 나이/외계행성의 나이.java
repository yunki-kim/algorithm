import java.util.stream.Stream;

class Solution {
    public String solution(int age) {
        int[] ageArray = Stream.of(String.valueOf(age).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ageArray.length; i++) {
            sb.append((char) (ageArray[i] + 97));
        }
        
        return sb.toString();
    }
}