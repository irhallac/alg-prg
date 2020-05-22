
import java.util.Scanner;

public class Giris2 {

    private static int toplam;
    private static final int BAS = 1;
    private static final int SON = 100;

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        long basZamani = System.currentTimeMillis();
        
        //asal sayıların bulunması ve sonuç
        System.out.println("TOPLAM ASAL SAYI ADEDİ: " + asalSay(BAS+1, SON));
        
        //geçen süre
        long geceSure = System.currentTimeMillis() - basZamani;
        System.out.println("\nToplam çalışma süresi:  " + (geceSure / 1000.0) + " saniye.\n");
    }

    /**
     * min ve max arasında kaç tane asal sayı var hesapla
     */
    private static int asalSay(int min, int max) {
        int say = 0;
        for (int i = min; i <= max; i++) {
            if (asalMi(i)) {
                say++;
            }
        }
        return say;
    }

    /**
     * Asal sayı testi
     */
    private static boolean asalMi(int Sayi) {
        int i = 2;
        while (i <= Sayi / 2) {
            if (Sayi % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
