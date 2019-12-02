import myprint.*;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import static myprint.Print.*;

public class CountNum {

    /**
     * @author Mouse Sun
     * @param args
     */
    public  static void main(String[] args){
//        int i=-94;
//        System.out.println(Integer.toBinaryString(i));
//        System.out.println(Integer.toBinaryString(i>>>2));
//            ShowMyString("My","name","is","mouse");
//        enumTest();

//        test();
//        final tt ta = new tt();
//        ta.data++;
//        tt tb = new tt();
//        Mill m = new Mill();
//        Grain g = m.process();
//        println(g);

//       Mill m = new WheatMill();
//        Grain g = m.process();
//        println(m.process());
//        m.info();


    }
    public static void ShowMyString(String... args){
        System.out.println(args.getClass());
        for (String str : args) {
            System.out.printf("%s\t",str);
        }
    }
    public static void enumTest(){
        System.out.println(Spiciness.one.ordinal());
        for (Spiciness s : Spiciness.values()) {
            System.out.println(s.ordinal());
        }
        printf("%d\n",12);
        println("num="+1233);



    }
}
