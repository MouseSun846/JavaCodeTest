package leetcode;
import static myprint.Print.*;

/**
 * 回文数
 * Date 2019/10/17  18:52
 */
public class backNum {

    public static void main(String[] args) {
        String str=""+10;
        boolean flag = true;
        int len = str.length();
        int mid = len/2;
        int lcnt=0,rcnt=0;
        if (len%2==0){
            rcnt=mid;
            lcnt=mid-1;
        }else {
            rcnt=mid+1;
            lcnt=mid-1;
        }
        while (rcnt<len && lcnt>=0){
            if (str.charAt(rcnt++)!=str.charAt(lcnt--)){
                flag=false;
            }
        }
        println("flag = "+flag);

    }
}

