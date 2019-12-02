package regex;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static myprint.Print.*;

public class MyRegex {
    public static void main(String[] args) {
//        println("12+1234".matches("(-|\\+)?\\d+"));
////        String str = "me you greif,not,happy  ji";
////        println(Arrays.toString(str.split("\\W+")));
////        println(str.replaceAll("g\\w+","----M----"));
        Scanner scanner = new Scanner("12,42, 78, 99,");
        scanner.useDelimiter(",");
        while (scanner.hasNext()){
            println(scanner.next());
        }
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
//        Collections.synchronizedCollection()


    }

}
