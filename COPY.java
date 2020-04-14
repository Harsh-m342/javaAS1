import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class COPY {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader(args[0]);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(args[1]);
            String s;
            while ((s=br.readLine()) != null){
                fw.write(s);
                fw.flush();
            }
            br.close();
            fw.close();
            System.out.println("FILE COPIED!!");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}