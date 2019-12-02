import java.io.*;

import static myprint.Print.*;
public class readtest {
    public static void main(String[] args) throws IOException {
//        BufferedReader  in = new BufferedReader(new InputStreamReader(System.in));
//        String s;
//        while ((s = in.readLine())!=null && s.length()!=0){
//            printf(s);
//        }
        PrintStream console = System.out;
        PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("test.txt")));
        System.setOut(out);
        println(1213);
        out.close();
        System.setOut(console);
        println(123);
    }
}
