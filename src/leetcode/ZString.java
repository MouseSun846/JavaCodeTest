package leetcode;

/**
 * Z字形变换
 */
import static myprint.Print.*;
public class ZString {
    public static void main(String[] args) {
        String str = "A";
        int numRows=3;
        int step = numRows-2;
        int col= (int) ((step+1)*(Math.ceil((double)(str.length())/(double)(numRows+step))));
        println("str.length()="+str.length());
        println("col="+col);
        char[][] zmap = new char[numRows][col];
        int cnt=0;
        for (int i = 0; i <col ; i++) {
                for (int j = 0; j < numRows; j++) {
                    if (cnt>str.length()-1){
                        break;
                    }else {
                        zmap[j][i]=str.charAt(cnt++);
                    }
                }
                for (int j =step; j >0 ; j--) {
                    if (cnt > str.length()-1) {
                        break;
                    } else {
                        zmap[j][++i] = str.charAt(cnt++);
                    }
                }
        }
        String res="";
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <col ; j++) {
                    res+=zmap[i][j];
            }
        }
        println(res);


    }
}
