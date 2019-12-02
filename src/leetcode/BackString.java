package leetcode;

import static myprint.Print.*;
public class BackString {
    public static int maxlen(String s,int left,int right){
        int lcnt=left,rcnt=right;
        while (lcnt>=0&&rcnt<s.length()&&s.charAt(rcnt)==s.charAt(lcnt)){
            lcnt--;
            rcnt++;
        }
        return rcnt-lcnt-1;
    }
    public static void main(String[] args) {
        String str = "bb";
        int start = 0;
        int end=0;
        int len=0;
        for (int i = 0; i < str.length(); i++) {
            int len1 = maxlen(str,i,i);
            int len2 = maxlen(str,i,i+1);
            len = Math.max(len1,len2);
            if (len>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        println(len);
        println(start);
        println(end);
        println(str.substring(start,end+1));
    }
}
