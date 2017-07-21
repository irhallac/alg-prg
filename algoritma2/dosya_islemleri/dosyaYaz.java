package labexercises;

import java.io.*;
import java.util.Random;

/**
 *
 * @author Ibrahim R Hallac <irhallac at firat.edu.tr>
 */
public class dosyaYaz {

    public static void main(String[] args) throws Exception {
        File f = new File("notlar.txt");
        PrintWriter yaz = new PrintWriter(f);
        Random rand = new Random();
        int s;
        String str;
        for (int i = 1; i <= 100; i++) {
            s = rand.nextInt(100) + 1;
            str = "ogrenci" + i + " sinav=" + s;
            yaz.println(str);
        }
        yaz.close();
    }

}
