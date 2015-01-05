//与编程之美中“寻找发帖水王”问题本质相同
public class Solution {
    public int majorityElement(int[] num) {
        int result = 0;
        int times = 0;
        for (int i = 0; i < num.length; i++) {
            if (times == 0) {
                result = num[i];
                times++;
            } else {
                if (result != num[i]) {
                    times--;
                } else {
                    times++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num = {4,5,4};
        int result = s.majorityElement(num);
        System.out.println(result);
    }

}
