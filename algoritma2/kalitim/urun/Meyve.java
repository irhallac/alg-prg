
/**
 *
 * @author ibrahim
 */
public class Meyve extends Urun {

    private String orijin;

    public Meyve(String isim, String birim, double fiyat, String orijin) {
        super(isim, birim, fiyat);
        this.orijin = orijin;
    }

    @Override
    public String toString() {
        return "ürün_adı: " + isim + " orijin: " + orijin + " id'si: " + id + ", " + birim + " fiyatı " + fiyat + " TL.";
    }

    public static void main(String[] args) {
        Meyve m1 = new Meyve("Kivi", "adet", 2.00, "Samsun");
        System.out.println(m1.toString());
    }

}
