package leetcode;
import java.util.*;

import static myprint.Print.*;

public class permute {


    public  void getOrder(List<Integer> nums, int first, List<List<Integer>> res){

        if (first == nums.size())
            res.add(new ArrayList<>(nums));
        for (int i = first; i < nums.size(); i++) {
            Collections.swap(nums,first,i);
            getOrder(nums,first+1,res);
            Collections.swap(nums,first,i);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<Integer> myList = new ArrayList<>();
        for (int num:nums) {
            myList.add(num);
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        new permute().getOrder(myList,0,res);
        println(res);
        
    }
}
