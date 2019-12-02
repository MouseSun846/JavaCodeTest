package leetcode;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

import static myprint.Print.*;
public class IntReverse {
    public static void main(String[] args) {
        int x=-563847412;
        int mod=0;
        int num=0;
        while (x!=0){
            mod = x%10;
            x/=10;
            println("M "+Integer.MAX_VALUE/10);
            if (num>Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE/10 && mod >7) ){
                num=0;
                break;
            }else if (num<Integer.MIN_VALUE/10|| (num == Integer.MAX_VALUE/10&&mod<-8)){
                num=0;
                break;
            }
            num=num*10+mod;
        }
        println(num);

    }
}
