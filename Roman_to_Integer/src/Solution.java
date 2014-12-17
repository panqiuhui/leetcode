import java.util.HashMap;
import java.util.Map;

/**
 * Created by panqiuhui on 2014/12/1.
 */
public class Solution {
    private static Map<Character, Integer> roman = new HashMap<Character, Integer>();

    static {
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
    }

    public int romanToInt(String s) {
        int result = 0;
        int i = 0;
        while (i < s.length()) {
            char cur = s.charAt(i);
            int curValue = roman.get(cur);
            if ((i + 1) < s.length()) {
                char next = s.charAt(i + 1);
                int nextValue = roman.get(next);
                if (nextValue > curValue) {
                    result += nextValue - curValue;
                    i += 2;
                    continue;
                }
            }
            result += curValue;
            i++;
        }
        return result;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.romanToInt("MMMCMXCIX"));//3999
        System.out.println(s.romanToInt("MDCLXVI"));//1666
        System.out.println(s.romanToInt("MDCCCLXXXVIII"));//1888
        System.out.println(s.romanToInt("MDCCCXCIX"));//1899
        System.out.println(s.romanToInt("MCMLXXVI"));//1976
        System.out.println(s.romanToInt("MCMLXXXIV"));//1984
        System.out.println(s.romanToInt("MCMXC"));//1990
    }
}
