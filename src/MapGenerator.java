import java.math.BigInteger;
import java.util.*;

import static myprint.Print.*;

public class MapGenerator {
    static void pong(){
        println("pong");
    }
    public static void main(String[] args) {
//        List mlist = Arrays.asList("a b c d e f g".split(" " ));
//        println(mlist);
//        BigInteger num1=new BigInteger("100000000000555555555555555555555555555555550000000000000000000000000000000000000000000000000");
//        BigInteger num2=new BigInteger("10000000000000000000000000555555555555555555555555555555555500000000000000000000000000000000001");
//        println(num1.add(num2));
        SortedSet<String> sortedSet = new TreeSet<String>();
        Collections.addAll(sortedSet,"1,2,3,4,5,6,7,8,9".split(","));
        println(sortedSet);
        String low = sortedSet.first();
        String high = sortedSet.last();
        println(low);
        println(high);
        Iterator<String> iterator = sortedSet.iterator();
        for (int i = 0; i < sortedSet.size(); i++) {
            println(iterator.next());
        }
        println("生成Set的子集 low--high"+sortedSet.subSet("2","5"));
        println("生成Set的子集 head--dst"+sortedSet.headSet("5"));
        println("生成Set的子集 tail--dst"+sortedSet.tailSet("3"));
        Thread t = new Thread(){
            @Override
            public void run() {
               pong();
            }
        };
        t.run();
        println("ping");

    }
}
