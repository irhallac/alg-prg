package labexercises;

import java.io.*;
import java.util.*;

/**
 *
 * @author Ibrahim R Hallac <irhallac at firat.edu.tr>
 */
public class dosyaOku {

    static int enk, enb, t, ort, n, s;

    public static void main(String[] args) throws Exception {
        File f = new File("notlar.txt");
        Scanner oku = new Scanner(f);
        t = 0;
        n = 0;
        String str;
        String[] satir;
        boolean ilk_satir = true;
        while (oku.hasNext()) {
            str = oku.nextLine();
            satir = str.split("=");
            s = Integer.parseInt(satir[1]);

            if (ilk_satir) {
                enb = enk = s;
                ilk_satir = false;
            } else {
                if (s > enb) {
                    enb = s;
                }
                if (s < enk) {
                    enk = s;
                }
            }
            t = t + s;
            n = n + 1;
        }
        ort = t / n;
        oku.close();
        System.out.println("ortalama=" + ort + " ogrenci sayisi=" + n);
        System.out.println("en_buyuk=" + enb + " en_kucuk=" + enk);
    }

}
