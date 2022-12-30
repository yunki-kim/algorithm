class Solution {
    public int solution(int order) {
        String orderStr = "" + order;
        int count = 0;
        for (int i = 0; i < orderStr.length(); i++) {
            if (orderStr.charAt(i) == '3'
                    || orderStr.charAt(i) == '6'
                    || orderStr.charAt(i) == '9') count++;
        }
        return count;
    }
}