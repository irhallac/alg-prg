
/**
 *
 * @author ibrahim
 */
public class Urun {

    String isim;
    static int id = 999;
    String birim; //adet, kilo, paket
    double fiyat;

    public Urun(String isim, String birim, double fiyat) {
        this.isim = isim;
        this.birim = birim;
        this.fiyat = fiyat;
        id = id + 1;  //otomatik id atama
    }

    @Override
    public String toString() {
        return "ürün_adı: " + isim + ", id'si: " + id + ", " + birim + " fiyatı " + fiyat + " TL.";
    }

    public static void main(String[] args) {
        System.out.println("Ürün oluşturma testi");
        Urun u1 = new Urun("Şampuan", "adet", 17.50);
        System.out.println(u1);
    }

}
