import static myprint.Print.*;
public enum OzWitch {
    WEST("west"),NORTH("north"),EAST("east"),SOUTH("south");
    private String description;
    OzWitch(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    enum Activity{a,b,c,d,e,f,g};
    public static void main(String[] args) {
//        for (OzWitch witch : OzWitch.values()) {
//            println(witch+"  :  "+witch.getDescription());
//        }


    }
}
