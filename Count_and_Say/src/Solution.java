/**
 * Created by panqiuhui on 2014/12/2.
 */
public class Solution {
    public String countAndSay(int n) {
        String result = "1";
        String numberStr = "1";
        for (int i = 1; i < n; i++) {
            char cur = numberStr.charAt(0);
            int count = 0;
            int j = 0;
            result = "";
            while (j < numberStr.length()) {
                if (numberStr.charAt(j) == cur) {
                    count++;
                } else {
                    result += count + "" + cur;
                    cur = numberStr.charAt(j);
                    count = 1;
                }
                j++;
            }
            result += count + "" + cur;
            numberStr = result;
        }
        return result;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.countAndSay(6));//312211
    }
}
