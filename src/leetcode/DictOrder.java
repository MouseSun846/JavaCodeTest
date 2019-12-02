package leetcode;
import java.util.Arrays;

import static myprint.Print.*;

public class DictOrder {
    public static void main(String[] args) {
        int[] nums = {3,5,8,7,6,4};
//        从右至左找到第一个左邻小于右邻的值，记录其下标i，值为a
        int index = 0 ;
        for (int i = nums.length-1; i > 0; i--) {
            if (nums[i-1]<nums[i]){
                index = i;
                break;
            }
        }
        boolean flag = false;
        //  从右至左找到第一个大于a的值
        for (int i = nums.length-1; i >=index-1; i--) {
                if (index>=1 && nums[i]>nums[index-1]){
        //交换数据
                    int temp = nums[i];
                    nums[i] = nums[index-1];
                    nums[index-1] = temp;
                    flag = true;
                    break;
                }
        }
        //最后从index后进行排序
        if (flag == false){
            Arrays.sort(nums);
        }else {
            Arrays.sort(nums,index,nums.length);
        }
        println(Arrays.toString(nums));


    }


}
