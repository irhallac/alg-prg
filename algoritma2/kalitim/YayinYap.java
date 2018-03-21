package labexercises;

/**
 *
 * @author Ibrahim R Hallac <irhallac at firat.edu.tr>
 */
interface Cihaz {

    void ac();

    void kapat();

    void goster(String s);
}

class TV implements Cihaz {

    @Override
    public void ac() {
        System.out.println("TV açıldı");
    }

    @Override
    public void kapat() {
        System.out.println("TV kapandı");

    }

    @Override
    public void goster(String s) {
        System.out.println("TV gösteriyor: " + s);
    }
}

class LCD implements Cihaz {

    @Override
    public void ac() {
        System.out.println("LCD açıldı");
    }

    @Override
    public void kapat() {
        System.out.println("LCD kapandı");

    }

    @Override
    public void goster(String s) {
        System.out.println("LCD gösteriyor: " + s);
    }
}

class Projektor implements Cihaz {

    @Override
    public void ac() {
        System.out.println("Projektor açıldı");
    }

    @Override
    public void kapat() {
        System.out.println("Projektor kapandı");

    }

    @Override
    public void goster(String s) {
        System.out.println("Projektor gösteriyor: " + s);
    }
}

public class YayinYap {

    static void yayin(Cihaz[] cihazlar) {
        System.out.println("YAYINDA...\n");
        for (int i = 0; i < cihazlar.length; i++) {
            cihazlar[i].ac();
            cihazlar[i].goster("TEST YAYINI");
            cihazlar[i].kapat();
            System.out.println("\n - - - - Sonraki Cihaz - - - - ");
        }

    }

    public static void main(String[] args) {
        Cihaz tv1 = new TV();
        Cihaz lcd1 = new LCD();
        Cihaz prjktr1 = new Projektor();
        Cihaz tv2 = new TV();

        Cihaz[] dizi1 = new Cihaz[4];
        dizi1[0] = tv1;
        dizi1[1] = lcd1;
        dizi1[2] = prjktr1;
        dizi1[3] = tv2;

        yayin(dizi1);
    }
}
