package Elelment;

import java.util.WeakHashMap;

public class Test {
    public static void main(String[] args) {
        int size = 1000;
        Key[] keys = new Key[size];
        WeakHashMap<Key,Value> map = new WeakHashMap<Key,Value>();
        for (int i = 0; i < size; i++) {
            Key k = new Key(""+i);
            Value v = new Value(""+i);
            if (i%3==0){
                keys[i]=k;
            }
            map.put(k,v);
            System.gc();
        }

    }
}
