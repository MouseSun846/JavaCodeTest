package leetcode;
import static myprint.Print.*;

/**
 * 寻找两个有序数的中位数
 */
public class MyTree {

    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2={3,4};
        int len = nums1.length + nums2.length;
        int[] temp = new int[len];
        int mid = 0;
        int len1=0,len2=0,cnt=0;
        while(len1<nums1.length && len2<nums2.length){
            if(nums1[len1]>nums2[len2]){
                temp[cnt++]=nums2[len2];
                len2++;
            }else{
                temp[cnt++]=nums1[len1];
                len1++;
            }
            if (len1 == nums1.length){
                break;
            }
            if (len2 == nums2.length){
                break;
            }
        }

        while(len2<nums2.length){
            temp[cnt++]=nums2[len2++];
        }
        while(len1<nums1.length){
            temp[cnt++]=nums1[len1++];
        }
        if(len % 2 == 0){
            mid = len/2-1;
            println ( (double)(temp[mid]+temp[mid+1])/(double)2);
        }
        mid = len/2;
        println(temp[mid]);
    }
}
