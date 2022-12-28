class Solution {
    public String solution(String my_string) {
        char[] stringArray = my_string.toCharArray();
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (stringArray[i] == vowels[j]) {
                    stringArray[i] = '0';
                    break;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i] != '0') sb.append(stringArray[i]);
        }
        return sb.toString();
    }
}