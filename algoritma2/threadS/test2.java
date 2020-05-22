/**
 *
 * @author ibrahim
 */
public class test2 {

    private static final int BAS = 0;
    private static final int SON = 100;

    public static void main(String[] args) {
        int threadSayisi = 5;
        int artis = (SON - BAS) / threadSayisi;
        
        System.out.println("artis miktari = " + artis);
        for (int i = 0; i < threadSayisi-1; i++) {
            System.out.println(BAS + 1 + (i * artis)+ "  ,  " + (BAS + (i + 1) * artis));
        }
        System.out.println("sonuncu thread");
        System.out.println(BAS + 1 + ((threadSayisi-1) * artis)+ "  ,  " + SON); 
    }
}
