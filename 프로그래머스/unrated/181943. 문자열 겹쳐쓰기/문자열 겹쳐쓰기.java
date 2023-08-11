class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        int overwriteCount = overwrite_string.length();
        
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.replace(s, s + overwriteCount, overwrite_string);
        
        return sb.toString();
    }
}