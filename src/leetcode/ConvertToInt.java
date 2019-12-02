package leetcode;
import static myprint.Print.*;
public class ConvertToInt {
    public static int digitCheck(String[] dest,String src,int start){
        String temp = "";
        int index = 0; //用于数据转换
        for (int i = start; i < src.length(); i++) {
            temp = src.substring(start,i+1);
            for (int j = 0; j < dest.length; j++) {
                if (dest[j].equals(temp)) {
                    index = Math.max(index,j);
                }
            }
        }
        return index;
    }


    public static void main(String[] args) {
        String s = "MMMMCDLVIII";
        String[] Q = {"", "M", "MM", "MMM"};
        String[] B = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] S = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] G = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        int res = 0;
        int digit = 0;
        int cnt = 0;
        digit = digitCheck(Q,s,0);
        res = digit * 1000;
        cnt += Q[digit].length();
        println("cnt = "+cnt);

        digit = digitCheck(B,s,cnt);
        res = res + digit*100;
        cnt += B[digit].length();
        println("cnt = "+cnt);

        digit = digitCheck(S,s,cnt);
        res = res + digit*10;
        cnt += S[digit].length();
        println("cnt = "+cnt);

        digit = digitCheck(G,s,cnt);
        res = res + digit;
        println("res = "+res);

    }
}
