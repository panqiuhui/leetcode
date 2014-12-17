import java.util.LinkedList;
import java.util.List;

/**
 * Created by panqiuhui on 2014/12/4.
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            if (result.size() <= i) {
                result.add(new LinkedList<Integer>());
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    result.get(i).add(1);
                } else {
                    result.get(i).add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        List<List<Integer>> result = s.generate(5);
        for (List<Integer> row : result) {
            String str = "";
            for (Integer i : row) {
                str += i + " ";
            }
            System.out.println(str);
        }
    }
}
