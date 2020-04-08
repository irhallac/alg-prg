
/**
 *
 * @author ibrahim
 */
public class _Test1 {

    public static void main(String[] args) {
        Urun u1 = new Urun("Şampuan", "adet", 17.50);
        System.out.println(u1);
        Urun u2 = new Urun("Süt", "kilo", 3.5);
        System.out.println(u2);
        Meyve m1 = new Meyve("Elma", "kilo", 5.75, "Adana");
        System.out.println(m1.toString());
        Meyve m2 = new Meyve("Limon", "adet", 5.75, "Antalya");
        System.out.println(m2);
        Icecek i1 = new Icecek("Kola", "adet", 2.25, "Pepsi", "Gazlı");
        System.out.println(i1);

    }
}
