package algoritma1;

import java.util.Scanner;

/**
 *
 * @author Ibrahim R Hallac <irhallac at firat.edu.tr>
 */
public class eb_iki_sayi {

    static int en_buyuk1, en_buyuk2, sayi, temp;

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("girilecek sayi adedini giriniz");
        int sayi_adedi = klavye.nextInt();
        System.out.println(sayi_adedi + " tane sayı okunacak");
        int counter = 0;
        while (counter < sayi_adedi) {
            System.out.println("");
            System.out.println((counter + 1) + ". sayi girişi");
            sayi = klavye.nextInt();
            if (counter == 0) {//ilk sayi girisi
                en_buyuk1 = sayi;
                System.out.println("ikinci sayi yok");
            } else if (counter == 1) { //ikinci sayi girisi
                if (sayi >= en_buyuk1) {
                    en_buyuk2 = en_buyuk1;
                    en_buyuk1 = sayi;
                } else {
                    en_buyuk2 = sayi;
                }
            } else { // ucuncu ve diger sayilar
                if (sayi > en_buyuk1) {
                    temp = en_buyuk1;
                    en_buyuk1 = sayi;
                    en_buyuk2 = temp;
                } else if (sayi > en_buyuk2) {
                    en_buyuk2 = sayi;
                }

            }
            System.out.println("1. en büyük=" + en_buyuk1 + "\n2. en büyük=" + en_buyuk2);
            counter++;
        }
    }
}
