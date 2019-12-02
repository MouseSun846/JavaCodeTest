import java.util.*;

import static myprint.Print.*;
public class MyGenerator {
//    public static class Integer implements Generator<java.lang.Integer> {
//        private int value = 0;
//        @Override
//        public java.lang.Integer next() {
//            return value++;
//        }
//    }
    public static void main(String[] args) {
//       Integer mint = new Integer();
//        for (int i = 0; i < 100000; i++) {
//            printf("%d\n",mint.next());
//        }
        Random random = new Random();
        Integer[] arr = new Integer[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        println(Arrays.toString(arr));
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1>o2?-1:(o1 == o2)?0:1;
            }
        });
//        Arrays.sort(arr);
        println(Arrays.toString(arr));
//        int key = Arrays.binarySearch(arr,arr[10]);
//        println("key="+key);
//        List<Integer> mlist = (List<Integer>) Arrays.asList(arr);
//        Collections.sort(mlist, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
//        println(mlist);
    }
}

