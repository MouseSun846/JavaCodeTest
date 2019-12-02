package myprint;

public class WheatMill extends Mill {
    public Wheat process(){
        return new Wheat();
    }
    public void info(){
        Print.println("samelike");
    }
}
