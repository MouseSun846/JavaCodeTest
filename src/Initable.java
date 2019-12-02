import java.util.List;

import static myprint.Print.*;
public class Initable {
    static final int staicFinal = 47;
    static final int StaicFinal2 = 50;
    static {
        println("Initable1");
    }
    private int a=10;

    private void setA(int a) {
        this.a = a;
    }
    private void g(){println("gggggg");}
    public int getA() {
        return a;
    }

    public <T> void fan(T  x){
        println(x.getClass().getName());
    }



}
