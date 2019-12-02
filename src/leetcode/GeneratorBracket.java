package leetcode;
import static myprint.Print.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratorBracket {
    String[] bracket = {"(",")"};
    public void generateParenthesis(int n,int step,String str,int lcnt,int rcnt, List<String> res) {

        if (step == (n-1)*2){
                Stack<String> mystack = new Stack<>();
                mystack.push("(");
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == '(') {
                        mystack.push("(");
                    } else if (str.charAt(j) == ')') {
                        if (mystack.isEmpty()){
                            break;
                        }
                        mystack.pop();
                    }
                }
                if (!mystack.isEmpty()){
                    mystack.pop();
                    if (mystack.isEmpty()){
                        if (mystack.isEmpty() ) {
                            String resstr = "(" + str + ")";
                            if (!res.contains(resstr))
                                res.add(resstr);
                        }
                    }
                }


            return;
        }
        for (int i = 0; i < (n-1)*2; i++) {
            if (lcnt>(n-1) || rcnt>(n-1))
            {
                lcnt=0;
                rcnt=0;
                break;
            }
            generateParenthesis(n,step+1,str+bracket[i%2],lcnt++,rcnt++,res);
        }


    }
    public static void main(String[] args) {
        int n = 3;
        List<String> res = new ArrayList<>();
        new GeneratorBracket().generateParenthesis(n,0,"",0,0,res);
        println("size = "+res.size());
        println(res);
    }

}
