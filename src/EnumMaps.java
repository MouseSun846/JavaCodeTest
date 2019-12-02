import java.util.EnumMap;
import java.util.Map;

import static myprint.Print.*;
public class EnumMaps {
    interface Command{void action();}
    public static void main(String[] args) {
        EnumMap<AlarmPoints,Command> em = new EnumMap<AlarmPoints, Command>(AlarmPoints.class);
        em.put(AlarmPoints.BATHROOM, new Command() {
            @Override
            public void action() {
                printf("bathboom\n");
            }
        });
        em.put(AlarmPoints.KITCHEN, new Command() {
            @Override
            public void action() {
                printf("kitchen\n");
            }
        });
        for (Map.Entry<AlarmPoints, Command> e : em.entrySet()) {
            printf(e.getKey()+" : ");
            e.getValue().action();
        }

    }
}
