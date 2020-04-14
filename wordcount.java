import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * wordcount
 */
public class wordcount {

    public static void main(String[] args) {
        BufferedReader reader = null;
        int ch= 0;
        try{
            reader= new BufferedReader(new FileReader(args[0]));
            String currline= reader.readLine();
            while(currline!=null){
                String[] words=currline.split("");
                for (String word:words){
                    ch+=word.length();
                }
                currline=reader.readLine();

            }
            reader.close();
            System.out.println("Number of chacters in the file: "+ ch);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}