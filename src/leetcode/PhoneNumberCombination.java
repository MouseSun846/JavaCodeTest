package leetcode;
import java.util.ArrayList;
import java.util.List;

import static myprint.Print.*;
public class PhoneNumberCombination {


    String[] words = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};


    public void orderGenerator(String data, int step, String value, List<String> result){
        String res = "";
        if (step >= data.length()){
            result.add(value);
            return;
        }
        String strs= words[data.charAt(step)-data.charAt(0)];
        for (int i = 0; i < strs.length(); i++) {
            orderGenerator(data,step+1,value+strs.charAt(i), result);
        }
    }



    public static void main(String[] args) {
        String digits = "23";
        List<String> result = new ArrayList<>();
        new PhoneNumberCombination().orderGenerator(digits,0,"",result);
        println(result);
    }
}
