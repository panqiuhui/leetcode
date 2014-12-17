import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by panqiuhui on 2014/12/5.
 */
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Map<Integer, Boolean>> rows = new LinkedList<Map<Integer, Boolean>>();
        List<Map<Integer, Boolean>> columns = new LinkedList<Map<Integer, Boolean>>();
        List<Map<Integer, Boolean>> blocks = new LinkedList<Map<Integer, Boolean>>();

        for (int i = 0; i < 9; i++) {
            Map<Integer, Boolean> temp = new HashMap<Integer, Boolean>();
            rows.add(temp);
            temp = new HashMap<Integer, Boolean>();
            columns.add(temp);
            temp = new HashMap<Integer, Boolean>();
            blocks.add(temp);
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                int num = board[i][j] - '0';
                if (rows.get(i).containsKey(num)) {
                    return false;
                } else {
                    rows.get(i).put(num, true);
                }
                if (columns.get(j).containsKey(num)) {
                    return false;
                } else {
                    columns.get(j).put(num, true);
                }
                int blockIndex = (i / 3) * 3 + j / 3;
                if (blocks.get(blockIndex).containsKey(num)) {
                    return false;
                } else {
                    blocks.get(blockIndex).put(num, true);
                }
            }
        }
        return true;
    }
}
