package mytest;

import java.io.File;

public class BB {

    public static void main(String[] args) {
        AA myaa = new AA();
        System.out.println(myaa.b);
        myaa.info=new Info() {
            @Override
            public void fly(int a) {
                System.out.println("A= "+a);
            }
        };

        myaa.setvalue(10);
        myaa.b = 11;

    }
}
