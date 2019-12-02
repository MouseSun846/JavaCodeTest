import java.util.prefs.Preferences;

import static myprint.Print.println;

public class BinToHex {
    public BinToHex() {
        println("初始化构造器");
    }
    public void insert(BinToHex aB){

    }
    public static void BinaryToHexFormatter(byte[] data){
        int n = 0;
        StringBuilder res = new StringBuilder();
        for (byte b : data) {
            if (n  % 16 == 0){
                res.append(String.format("%05x: ",n));
            }
            res.append(String.format("%02x ",b));
            n++;
            if (n % 16 == 0){
                res.append(String.format("\n"));
            }
        }
        res.append(String.format("\n"));
        println(res);
    }
     public static void main(String[] args) {
//        ABtest aBtest=new ABtest();
//        aBtest.insert(new ABtest());
//        List<Integer> list = new LinkedList<>();
//        list.add(1);
//        list.add(2);
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(2);
//        list1.add(3);
//         list1.add(4);
//         list1.add(5);
//         list1.add(6);
//         list1.add(7);
//        println(list1);
//        list1.retainAll(list);
//         Collections.shuffle(list1,new Random(6));
//        println(list1);
//        ListIterator<Integer> listIterator = list1.listIterator();
//        Random random = new Random(20);
//        Map<Integer,Integer> m = new HashMap<>();
//         for (int i = 0; i < 10; i++) {
//             int r = random.nextInt(100);
//             //获取下标key对应的value
//             Integer num = m.get(r);
//             m.put(i,num == null?1:num+1);
//         }
//         println(m.keySet());
//         Queue<Integer> queue = new LinkedList<>();
//         Logger logger =  Logger.getLogger("log");
//         logger.severe("error!");
//         logger.severe("doeeenw");
//         logger.severe("dhas");
//         System.out.printf("hu");
//         System.out.format("hji");
//         Formatter formatter = new Formatter(System.err);
//         formatter.format("\nhellword\n");
//         println(String.format("age =  %d \n",20));

//         File file = new File("F:/JAVA/0826/out/production/0826/CountNum.class");
//         try {
//             FileInputStream in = new FileInputStream(file);
//             BinaryToHexFormatter(in.readAllBytes());
//         } catch (FileNotFoundException e) {
//             e.printStackTrace();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

     }
}
