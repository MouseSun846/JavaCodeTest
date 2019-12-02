package leetcode;
import static myprint.Print.*;

/**
 * 字符串公共前缀
 */
public class MaxCommonLenStart {
    public static void main(String[] args) {
        String[]  strs ={"aca","cba"};

        String minStr = strs[0];
        int minlen = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length()<=minlen){
                minlen = strs[i].length();
            }
        }
        int cnt = 0;
        boolean flag = false;
        for (int j = 0; j < minlen; j++) {
            char temp = minStr.charAt(j);
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].charAt(j) == temp){
                    flag = true;
                }else {
                    flag = false;
                    break;
                }
            }
            if (flag){
                cnt++;
            }else {
                break;
            }

        }

        println(minStr.substring(0,cnt));
    }
}

