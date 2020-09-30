import java.io.*;
import java.io.File;
public class driver {

    static File f;
    static String x = "";

    public driver() {
    }
    
    public static void main(String[] args) {
        translator t = new translator();
        try {
            String s="";
            File t1 = new File("t.txt");
            BufferedReader br = new BufferedReader(new FileReader(t1));
            x = "";
            while ((s = br.readLine()) != null) {
                x+=s+" ";
            }
            x = t.transliterate(x);
            x=t.punctuator(x);
            File t2 = new File("t1.txt");
            PrintWriter out = new PrintWriter("t1.txt");
            out.println(x);
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }