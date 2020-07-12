import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* The isBadVersion API is defined in the parent class VersionControl.
 */
public class Solution {
    public int[][] numSubmat(int[][] mat) {
        int res=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j]==1){
                    int k,l;
                    for (k = j+1; k <mat[i].length&&mat[i][k]==1 ; k++) {
                        mat[i][j]++;
                    }
                    for (l = i+1; l <mat.length&&mat[l][j]==1 ; l++) {
                        mat[i][j]++;
                    }
                    for (int m = i+1; m < l; m++) {
                        int n;
                        for (n = j+1; n < k&&mat[m][n]==1; n++) {
                            mat[i][j]++;
                        }
                        k=n;
                    }
                }
            }
        }
        return mat;
    }
    public int getLastMoment(int n, int[] left, int[] right) {
        int max=0;
        for (int e:
             left) {
            max=Math.max(max,n-e);
        }
        for (int e:
             right) {
            max=Math.max(max,e);
        }
        return max+1;
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int minLen = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            minLen = Math.min(minLen, strs[i].length());
        }
        String res = strs[0].substring(0, minLen);
        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < minLen; j++) {
                if (strs[i].charAt(j) != res.charAt(j)) {
                    res = res.substring(0, j);
                    minLen = j;
                    break;
                }
            }
            if (res == "") {
                return "";
            }
        }
        return res;
    }
}

