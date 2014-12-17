/**
 * Created by panqiuhui on 2014/12/1.
 */
public class Solution {
    public int reverse(int x) {
        int result = 0;
        String xStr = String.valueOf(x);
        String xStrReverse = "";
        for (int i = xStr.length() - 1; i >= 1; i--) {
            xStrReverse += xStr.charAt(i);
        }
        if (xStr.charAt(0) != '-') {
            xStrReverse += xStr.charAt(0);
        } else {
            xStrReverse = '-' + xStrReverse;
        }
        try {
            result = Integer.valueOf(xStrReverse);
        } catch (NumberFormatException e) {
            result = 0;
        }
        return result;
    }

    //java中Integer类中的reverse源码
    public int reverse2(int i) {
        i = (i & 0x55555555) << 1 | (i >>> 1) & 0x55555555;
        i = (i & 0x33333333) << 2 | (i >>> 2) & 0x33333333;
        i = (i & 0x0f0f0f0f) << 4 | (i >>> 4) & 0x0f0f0f0f;
        i = (i << 24) | ((i & 0xff00) << 8) |
                ((i >>> 8) & 0xff00) | (i >>> 24);
        return i;
    }

    public static void main(String[] args) {
        Solution m = new Solution();
        System.out.println(m.reverse(1));
    }
}
