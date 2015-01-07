/**
 * Created by panqiuhui on 2015/1/6.
 */
public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] versions1 = version1.split("\\.");
        String[] versions2 = version2.split("\\.");
        if (versions1.length <= versions2.length) {
            int version1Int;
            int version2Int;
            int i;
            for (i = 0; i < versions1.length; i++) {
                version1Int = Integer.valueOf(versions1[i]);
                version2Int = Integer.valueOf(versions2[i]);
                if (version1Int > version2Int) {
                    return 1;
                } else if (version1Int < version2Int) {
                    return -1;
                }
            }
            if (versions1.length == versions2.length) {
                return 0;
            } else {
                version2Int = Integer.valueOf(versions2[i]);
                if (version2Int == 0) {
                    return 0;
                } else {
                    return -1;
                }
            }
        } else {
            int version1Int;
            int version2Int;
            int i;
            for (i = 0; i < versions2.length; i++) {
                version1Int = Integer.valueOf(versions1[i]);
                version2Int = Integer.valueOf(versions2[i]);
                if (version1Int > version2Int) {
                    return 1;
                } else if (version1Int < version2Int) {
                    return -1;
                }
            }
            if (versions1.length == versions2.length) {
                return 0;
            } else {
                version1Int = Integer.valueOf(versions1[i]);
                if (version1Int == 0) {
                    return 0;
                } else {
                    return 1;
                }
            }
        }
    }
}
