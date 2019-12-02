import java.util.*;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */
public class Main {

    public static void main(String[] args) {
       int[] numbers = {31,15,1,1,1};
       List<String> list = new ArrayList<>();
        int[] arr = new int[numbers.length];
        sort(0,arr,numbers,list);
        System.out.println(list);
        String res = compare(list.get(0),list.get(1));
        String temp=res;
        for (int i = 2; i < list.size(); i++) {
            res = compare(temp,list.get(i));
            temp = res;
        }

       System.out.println("res = "+res);






    }
    private static String compare(String str1,String str2){
        String str="";
        int res = str1.compareTo(str2);
        if (res>0){
            str=str2;
        }else{
            str=str1;
        }
        return str;
    }

    private static void sort(int n, int[] arr,int[] num, List<String> list){
        String str="";
        if (n == arr.length){
            for (int i = 0; i < arr.length; i++) {
                str+=num[arr[i]];
            }
            list.add(str);
            str="";
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[n] = i;
            if (isalready(n,arr)){
                continue;
            }
            sort(n+1, arr,num,list);
        }
    }
    private static boolean isalready(int index,int[] arr){
        for (int i = 0; i < index; i++) {
            if (arr[i] == arr[index]){
                return true;
            }
        }
        return false;
    }
}
