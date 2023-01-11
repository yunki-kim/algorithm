import java.util.HashMap;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        HashMap<String, String> loginTable = new HashMap<>();
        loginTable.put(id_pw[0], id_pw[1]);

        String result = "fail";
        for (String[] candidate : db) {
            String id = candidate[0];
            if (loginTable.get(id) == null) result = "fail";
            else if (loginTable.get(id).equals(candidate[1])) {
                result = "login";
                break;
            }
            else {
                result = "wrong pw";
                break;
            }
        }
        return result;
    }
}