package algoritma1;

import java.util.Scanner;

/**
 *
 * @author Ibrahim R Hallac <irhallac at firat.edu.tr>
 * n. harmonik sayiyi ekrana yazdıran program 1/1 + 1/2 + ... + 1/n.
 * 
 * çalışma ekranı:
 * 
 * n değerini giriniz
 * 2
 * 1.5
 * 
 * n değerini giriniz
 * 10
 * 2.9289682539682538 
 */
public class HarmonikSayi {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("n değerini giriniz");
        int n = klavye.nextInt();

        double toplam = 0.0;
        for (int i = 1; i <= n; i++) {
            toplam += 1.0 / i;
        }

        System.out.println(toplam);
    }
}
