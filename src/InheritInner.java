import myprint.Print;

public class InheritInner extends WithInner.Inner{
    public InheritInner(WithInner withInner) {
        withInner.super();
    }
    public static void main(String[] args){
        WithInner wi = new WithInner();
        InheritInner inheritInner = new InheritInner(wi);
    }
}
