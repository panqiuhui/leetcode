public class Solution {
    public String convert(String s, int nRows) {
        String result = "";
        if (nRows == 1) {
            return s;
        }
        int circle = 2 * nRows - 2;
        for (int i = 0; i < nRows; i++) {
            int interval = circle - 2 * i;
            if (i == 0 || i == nRows - 1) {
                int index = i;
                while (index < s.length()) {
                    result += s.charAt(index);
                    index += circle;
                }
            } else {
                int index = i;
                while (index < s.length()) {
                    result += s.charAt(index);
                    if ((index + interval) < s.length()) {
                        result += s.charAt(index + interval);
                    }
                    index += circle;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String text = "PAYPALISHIRING";
        String result = s.convert(text, 3);
        System.out.println(result);
    }
}
