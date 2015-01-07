/**
 * Created by panqiuhui on 2015/1/7.
 */
public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int index = m + n - 1;
        int indexa = m - 1;
        int indexb = n - 1;

        //从后往前排序，无需现将A后裔
        while (indexa >= 0 && indexb >= 0) {
            if (A[indexa] > B[indexb]) {
                A[index--] = A[indexa--];
            } else {
                A[index--] = B[indexb--];
            }
        }
        //因为A的长度可能超过m+n，所以剩余的A要后移
        while (indexa >= 0) {
            A[index--] = A[indexa--];
        }
        while (indexb >= 0) {
            A[index--] = B[indexb--];
        }
    }
}
