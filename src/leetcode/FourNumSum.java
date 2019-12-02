package leetcode;
import static myprint.Print.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourNumSum {
    public static void main(String[] args) {
//        int[] nums = {1, 0, -1, 0, -2, 2};
//        int[] nums = {2,1,0,-1};
//        int[] nums = {-3,-2,-1,0,0,1,2,3};
        int[] nums = {-3,-2,-1,0,0,1,2,3};
//        int[] nums = {-1,0,1,2,-1,-4};
        int left = 0;
        int right = 0;
        int sum = 0;
        int target = 0;
        List<List<Integer>> myList = new ArrayList<>();
        if (nums.length<4){
            println("null");
        }else if (nums.length == 4){
            for (int i = 0; i < 4; i++) {
                sum+=nums[i];
            }
            if (sum == target) {
                myList.add(Arrays.asList(nums[0],nums[1],nums[2],nums[3]));
            }
            println(myList);
        }
        Arrays.sort(nums);
        for (int j = 0; j < nums.length-3; j++) {
            if (j>0 && (nums[j] == nums[j-1])) continue;
            int dst = target - nums[j];
            for (int i = j+1; i < nums.length-2; i++) {
                left = i+1;
                right = nums.length-1;
                if (i>j+1 && (nums[i] == nums[i-1]) )
                {
                    continue;
                }
                while (left<right){
                    sum = nums[i]+nums[left]+nums[right];
                    if (sum<dst){
                        //向右跑
                        while ((left<right) && (nums[left] == nums[++left]));
                    }else if (sum>dst){
                        //向左跑
                        while ((left<right) && (nums[right] == nums[--right]));
                    }else {
                        myList.add(Arrays.asList(nums[j],nums[left],nums[i],nums[right]));
                        println("tuple = {"+nums[j]+","+nums[left]+","+nums[i]+","+nums[right]+"}");
                        while ((left<right) && (nums[left] == nums[++left]));
                        while ((left<right) && (nums[right] == nums[--right]));
                    }
                }

            }
        }

    }
}
