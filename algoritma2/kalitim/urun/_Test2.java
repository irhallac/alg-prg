
/**
 *
 * @author ibrahim
 */
public class _Test2 {

    public static void main(String[] args) {
        Urun[] urunler = new Urun[5];

        urunler[0] = new Urun("Şampuan", "adet", 17.50);
        urunler[1] = new Urun("Süt", "kilo", 3.5);
        urunler[2] = new Meyve("Elma", "kilo", 5.75, "Adana");;
        urunler[3] = new Meyve("Limon", "adet", 5.75, "Antalya");;
        urunler[4] = new Icecek("Kola", "adet", 2.25, "Pepsi", "Gazlı");;

        double toplam_fiyat = 0;
        for (int i = 0; i < urunler.length; i++) {
            toplam_fiyat += urunler[i].fiyat;
        }

        System.out.println("toplam_fiyat = " + toplam_fiyat);
    }
}
