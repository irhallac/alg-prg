
import java.util.Scanner;

public class Bolum2 {

    private static int toplam;
    private static final int BAS = 40;
    private static final int SON = 40000;
    

   synchronized private static void toplamaEkle(int x) {
        toplam = toplam + x;
       // System.out.println(" yeni asal sayı adedi: " + toplam);
    }

    private static class asalSayThread extends Thread {
        int say = 0;
        int min, max;

        public asalSayThread(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public void run() {
            //say = asalSay(min, max);
            //System.out.println(min + " ve " + max + " arasında toplam " + say + " adet asal sayı var");
            for (int i = min; i <= max; i++) {
                toplamaEkle(1);
            }
            
        }
    }

    private static void asalSayThread(int threadSayisi) {
        int artis = (SON - BAS) / threadSayisi;

        System.out.println((BAS) + " ile " + (SON) + " arasındaki asal sayıların adedi " + threadSayisi + " tane Thread ile bulunuyor...\n");

        long basZamani = System.currentTimeMillis();

        asalSayThread[] islemler = new asalSayThread[threadSayisi];

        for (int i = 0; i < threadSayisi - 1; i++) {
            islemler[i] = new asalSayThread(BAS + i * artis + 1, BAS + (i + 1) * artis);
        }
        islemler[threadSayisi - 1] = new asalSayThread(BAS + 1 + ((threadSayisi - 1) * artis), SON);
        toplam = 0;
        for (int i = 0; i < threadSayisi; i++) {
            islemler[i].start();
        }
        
        
        for (int i = 0; i < threadSayisi; i++) {
            while (islemler[i].isAlive()) {
                try {
                    islemler[i].join();
                } catch (InterruptedException e) {
                }
            }
        }
        
        long geceSure = System.currentTimeMillis() - basZamani;
        System.out.println("\nToplam asal sayı adedi " + toplam + ".");
        System.out.println("\nToplam çalışma süresi:  " + (geceSure / 1000.0) + " saniye.\n");
    }

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Kaç tane thread kullanılsın  (en az 1 girilmeli) ?  ");
        asalSayThread(klavye.nextInt());
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
