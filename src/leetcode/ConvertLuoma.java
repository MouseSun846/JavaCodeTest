package leetcode;
import static myprint.Print.*;

/**
 *罗马数转阿拉伯数字
 */
public class ConvertLuoma {
    public static void main(String[] args) {
        int num = 99;
        String res="";
        String[] Q = {"", "M", "MM", "MMM"};
        String[] B = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] S = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] G = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        res = Q[Math.round(num/1000)] + B[Math.round((num%1000)/100)] + S[Math.round((num%100)/10)] + G[num%10];
        println(res);
    }
}
