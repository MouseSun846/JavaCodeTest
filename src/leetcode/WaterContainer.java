package leetcode;
import static myprint.Print.*;

public class WaterContainer {
    /**
     * 双指针法
     * @param height
     * @return
     */
    private static int shuangzhizhen(int[] height){
        int head = 0;
        int tail = height.length-1;
        int area = 0,temp = 0;
        while (true){
            temp = Math.min(height[head],height[tail])*(tail-head);
            area = Math.max(area,temp);
            if (height[head]<height[tail]){
                head++;
            }else {
                tail--;
            }
            if (head == tail){
                break;
            }

        }
        return area;

    }

    /**
     * 暴力法
     * @param height
     * @return
     */
    private static int baoliMethod(int[] height){
        int wi = 0;
        int he = 0;
        int area = 0;
        for (int i = 0; i < height.length-1; i++) {
            for (int j = i+1; j <height.length ; j++) {
                wi = j-i;
                he = Math.min(height[j],height[i]);
                area = Math.max(area,wi*he);
            }
        }
        return area;
    }


    public static void main(String[] args) {
        int area = 0;
        int[] height = {1,1};
        area= shuangzhizhen(height);
        println("max area = "+area);
    }
}
