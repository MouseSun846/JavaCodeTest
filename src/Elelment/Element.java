package Elelment;
import static myprint.Print.*;
public class Element {
    private String ident;
    public Element(String id){
        ident = id;
    }

    @Override
    public String toString() {
        return ident;
    }

    @Override
    public int hashCode() {
        return ident.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Element && ident.equals(((Element)obj).ident);
    }
    protected void finalize(){
        println("Finalizing "+getClass().getSimpleName()+"  "+ident);
    }


}
