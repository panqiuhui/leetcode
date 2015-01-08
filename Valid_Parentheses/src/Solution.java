import java.util.Stack;

/**
 * Created by panqiuhui on 2015/1/8.
 */
public class Solution {
    public boolean isValid(String s) {
        if (s == null || s.equals("")) {
            return true;
        }
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            if (c.equals("{") || c.equals("[") || c.equals("(")) {
                stack.push(c);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                String top = stack.pop();
                if (c.equals("}")) {
                    if (!top.equals("{")) {
                        return false;
                    }
                } else if (c.equals("]")) {
                    if (!top.equals("[")) {
                        return false;
                    }
                } else if (c.equals(")")) {
                    if (!top.equals("(")) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
