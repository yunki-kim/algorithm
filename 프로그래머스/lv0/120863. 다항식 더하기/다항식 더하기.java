class Solution {
    public String solution(String polynomial) {
        String[] stringArray = polynomial.split(" ");
        int sumX = 0;
        int sum = 0;
        for (String string : stringArray) {
            if (string.equals("+")) continue;
            if (string.contains("x")) {
                String temp = string.replace("x", "");
                if (temp.equals("")) sumX++;
                else sumX += Integer.parseInt(temp);

            } else sum += Integer.parseInt(string);
        }

        StringBuilder sb = new StringBuilder();
        if (sumX != 0 && sum != 0) {
            return sumX == 1 ? sb.append("x").append(" + ").append(sum).toString()
                    : sb.append(sumX).append("x").append(" + ").append(sum).toString();
        }
        if (sumX != 0) return sumX == 1 ? sb.append("x").toString() : sb.append(sumX).append("x").toString();

        return sum != 0 ? sb.append(sum).toString() : "0";
    }
}