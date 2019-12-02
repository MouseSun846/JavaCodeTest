import java.io.*;
public class TongHuaShun {
    public static void main(String[] args) {
        String str = "300459|603589|300486|12456";
        String catstr ="";
        for (int i = 0; i < str.length(); i++) {
            String temp = (""+str.charAt(i));
            if (temp.equals("|")){
               catstr+="\n";
            }else {
                catstr+=temp;
            }
        }
        File file = new File("1.txt");
        try {
            FileOutputStream out = new FileOutputStream(file);
            out.write(catstr.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
