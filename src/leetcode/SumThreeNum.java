package leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static myprint.Print.*;

public class SumThreeNum {
//    public static void main(String[] args) {
//        int[] nums = {-1, 0, 1, 2, -1, -4};
//        Arrays.sort(nums);
//        List<List<Integer>> myList = new ArrayList<>();
//        int sum ;
//        for (int i = 0; i < nums.length-2; i++) {
//            sum = -nums[i];
//            for (int j = i+1; j <nums.length-1 ; j++) {
//                for (int k = j+1; k < nums.length; k++) {
//                    if ((nums[k]+nums[j]) == sum){
//                       println("tuple = {"+nums[i]+","+nums[j]+","+nums[k]+"}");
//                        List<Integer> data = new ArrayList<>();
//                        data.add(nums[i]);
//                        data.add(nums[j]);
//                        data.add(nums[k]);
//                        data.sort(new Comparator<Integer>() {
//                            @Override
//                            public int compare(Integer o1, Integer o2) {
//                                return o2-o1;
//                            }
//                        });
//                        if (!myList.contains(data)){
//                            myList.add(data);
//                        }
//                    }
//                }
//            }
//        }
//
//    }
        public static void main(String[] args) {
            int[] nums = {-1, 0, 1, -1};
            int left = 0;
            int right = 0;
            int sum = 0;
            List<List<Integer>> myList = new ArrayList<>();
            Arrays.sort(nums);
            for (int i = 0; i < nums.length-2; i++) {
                if (nums[i]>0){
                    break;
                }
                if (i>0 && (nums[i] == nums[i-1])) continue;
                left = i+1;
                right = nums.length-1;
                while (left<right){
                    sum = nums[i]+nums[left]+nums[right];
                    if (sum<0){
                        //向右跑
                        while ((left<right) && (nums[left] == nums[++left]));
                    }else if (sum>0){
                        //向左跑
                        while ((left<right) && (nums[right] == nums[--right]));
                    }else {
                        myList.add(Arrays.asList(nums[left],nums[i],nums[right]));
//                        println("tuple = {"+nums[left]+","+nums[i]+","+nums[right]+"}");
                        while ((left<right) && (nums[left] == nums[++left]));
                        while ((left<right) && (nums[right] == nums[--right]));
                    }
                }

            }
        }
}
