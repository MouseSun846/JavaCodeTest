package leetcode;

import java.util.HashMap;

import static myprint.Print.*;
public class MyMap {
    public static void main(String[] args) {
        String str = "abcabdfg";
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        int left = 0;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))){
                left = Math.max(left,map.get(str.charAt(i))+1);
            }
            map.put(str.charAt(i),i);
            max = Math.max(max,i-left+1);
            println("l = "+left);
            println("m = "+max);
        }
        println("max = "+max);
    }
}
