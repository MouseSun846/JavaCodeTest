package leetcode;
import static myprint.Print.*;
public class MaxCommonLen {
    /**
     * 滑动窗口求最长公共子序列
     * @param args
     */
    public static void main(String[] args) {
//        String[] strs = {"fower","adcflow","flight"};
//        String[] strs = {"baab","bacb","b","cbc"};
//        String[]  strs = {"dog","racecar","car"};
//        String[]  strs ={"ca","a"};
        String[] strs = {"cgfda","acagfa","fwegfg"};
        boolean flag = false;

        if (strs.length == 0){
           println("res = ");
        }else if (strs.length == 1){
            println("res = "+strs[0]);
        }
        String minStr = strs[0];
        int minlen = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length()<=minlen){
                minlen = strs[i].length();
                minStr=strs[i];
            }
        }
        int start = 0;
        int end = 0;
        boolean over = false;
        for (int i = 0; i < minlen; i++) {
            String temp = minStr.substring(start,end+1);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].contains(temp)){
                    flag = true;
                }else {
                    flag = false;
                    break;
                }
            }
            if (flag){
                end++;
                flag = false;

                over = true;
            }else {
                if (over){
                    break;
                }
                start++;
                end++;
            }
        }
        println("start = "+start + " end = "+ end);
        if (start>=end){
         println(" ");
        }else {
            println(minStr.substring(start,end));
        }

    }
}
