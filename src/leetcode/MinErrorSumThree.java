package leetcode;
import static myprint.Print.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MinErrorSumThree {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        Arrays.sort(nums);
        int left = 0;
        int right = 0;
        int sum = 0;
        int target = 1;
        int minnum = 0;
        int error = 0;
        int num = 0;
        boolean flag = true;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            if (i>0 && (nums[i] == nums[i-1])) continue;
            left = i+1;
            right = nums.length-1;
            while (left<right){
                sum = nums[i]+nums[left]+nums[right];
                if (sum<target){
                    //向右跑去重
                    while ((left<right) && (nums[left] == nums[++left]));

                }else if (sum>target){
                    //向左跑去重
                    while ((left<right) && (nums[right] == nums[--right]));

                }else {
                    while ((left<right) && (nums[left] == nums[++left]));
                    while ((left<right) && (nums[right] == nums[--right]));
                }
                error = Math.abs(sum-target);
                    if (flag){
                        minnum = error;
                        num = sum;
                        flag = false;
                    }else {
                        if (error<minnum){
                            minnum = error;
                            num = sum;
                        }
                }
            }
        }
        println("minnum = "+num);
    }
}
