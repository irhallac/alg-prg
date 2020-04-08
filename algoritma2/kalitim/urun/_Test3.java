
/**
 *
 * @author ibrahim
 */
public class _Test3 {

    public static void main(String[] args) {
        Urun[] urunler = new Urun[5];

        urunler[0] = new Urun("Şampuan", "adet", 17.50);
        urunler[1] = new Urun("Süt", "kilo", 3.5);
        urunler[2] = new Meyve("Elma", "kilo", 5.75, "Adana");;
        urunler[3] = new Meyve("Limon", "adet", 5.75, "Antalya");;
        urunler[4] = new Icecek("Kola", "adet", 2.25, "Pepsi", "Gazlı");;

        System.out.println("Kilo ile satılan ürünleri isimleri");
        for (int i = 0; i < urunler.length; i++) {
            if (urunler[i].birim.equals("kilo")) {
                System.out.println(urunler[i].isim);
            }
        }

        System.out.println("Adet ile satılan ürünler ve fiyatları");
        for (int i = 0; i < urunler.length; i++) {
            if (urunler[i].birim.equals("adet")) {
                System.out.println(urunler[i]);
            }
        }

    }
}
