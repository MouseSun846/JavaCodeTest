package leetcode;

import static myprint.Print.*;
public class ATOI {
    public static void main(String[] args) {
        String str = "+0 123 words and ";
        int temp=0,num=0;
        boolean start = false;
        boolean sing = false;
        for (int i = 0; i < str.length(); i++) {
            temp=str.charAt(i)-48;
            if (str.charAt(i)==' ')
            {
                if (start){
                    break;
                }
                continue;
            }else if (str.charAt(i)=='-'){
                if (start)
                {
                    break;
                }
                start=true;
                sing=true;
                continue;
            }else if (str.charAt(i)=='+'){
                if (start)
                {
                    break;
                }
                start=true;
                continue;
            }
            else if (temp<=9 && temp>=0)
            {
                start=true;
            }else {
//                if (start){
                    break;
//                }
            }
            if (start){
                    if (sing){
                        temp*=-1;
                        if (num<Integer.MIN_VALUE/10 || (num<=Integer.MIN_VALUE/10 && temp<-8)){
                           num = 0;
                           break;
                        }
                    }else {
                        if (num>Integer.MAX_VALUE/10 || (num>=Integer.MAX_VALUE/10 && temp>7)){
                            num = 0;
                            break;
                        }
                    }
                    num=num*10+temp;
                }
        }
        println("RES = "+num);
        println(Integer.MAX_VALUE);
        println(Integer.MIN_VALUE);

    }
}
