
/**
 *
 * @author ibrahim
 */
public class Icecek extends Urun {

    private String marka;
    private String tur; //gazlı, gazsız

    public Icecek(String isim, String birim, double fiyat, String marka, String tur) {
        super(isim, birim, fiyat);
        this.marka = marka;
        this.tur = tur;
    }

    @Override
    public String toString() {
        return "ürün_adı: " + isim + " marka: " + marka + " tur: " + tur + " id'si: " + id + ", " + birim + " fiyatı " + fiyat + " TL.";
    }

    public static void main(String[] args) {
        Icecek i1 = new Icecek("Nar Suyu", "adet", 4.50, "Dimes", "Gazsız");
        System.out.println(i1);
    }

}
