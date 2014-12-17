import java.util.LinkedList;
import java.util.List;

/**
 * Created by panqiuhui on 2014/12/4.
 */
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new LinkedList<Integer>();
        List<Integer> preRow = new LinkedList<Integer>();
        for (int i = 0; i <= rowIndex; i++) {
            result.clear();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    result.add(1);
                } else {
                    result.add(preRow.get(j - 1) + preRow.get(j));
                }
            }
            preRow.clear();
            preRow.addAll(result);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        List<Integer> row = s.getRow(3);
        String str = "";
        for (Integer i : row) {
            str += i + " ";
        }
        System.out.println(str);
    }
}
