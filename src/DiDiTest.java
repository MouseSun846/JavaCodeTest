import java.util.*;

public class DiDiTest {
    public static void main(String[] args) {
        List<String> orderStr = new LinkedList<>();
        Map<String,Integer> strcnt = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String str = scanner.next();
            String[] res = str.split(",");

            for (int i = 0; i < res.length; i++) {
                if (orderStr.contains(res[i]))
                {
                    int num = 0;
                    num = strcnt.get(res[i]);
                    strcnt.put(res[i],num+1);
                    orderStr.add(res[i]+"_"+num);
                }else {
                    strcnt.put(res[i],0);
                    orderStr.add(res[i]);
                }
            }
            //a,b,b,c,a,a,b,a,c
            System.out.printf("[");
            for (int i = 0; i < orderStr.size()-1; i++) {
                System.out.printf("\'"+orderStr.get(i)+"\'"+",");
            }
            System.out.printf("\'"+orderStr.get(orderStr.size()-1)+"\']");



        }
    }


}
