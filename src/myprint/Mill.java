package myprint;

public class Mill {
    public Grain  process(){
        return new Grain();
    }
    public void info(){
        Print.println("same");
    }
}
