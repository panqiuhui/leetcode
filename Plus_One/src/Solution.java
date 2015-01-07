import java.util.LinkedList;
import java.util.List;

/**
 * Created by panqiuhui on 2015/1/7.
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        if (digits == null) {
            return null;
        }
        List<Integer> temp = new LinkedList<Integer>();
        int carry = 1;
        int sum = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (carry == 0) {
                temp.add(0, digits[i]);
                continue;
            }
            sum = digits[i] + carry;
            carry = sum / 10;
            temp.add(0, sum % 10);
        }
        if (carry != 0) {
            temp.add(0, carry);
        }
        int[] result = new int[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }
        return result;
    }
}
