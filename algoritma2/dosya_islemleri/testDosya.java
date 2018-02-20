
import java.io.File;
import java.io.IOException;

public class testDosya {

    public static void main(String[] args) {
        File dosya = new File("dene/test2.txt");
        try {
            System.out.println("dosya olustur");
            dosya.createNewFile();
            System.out.println("dosya oluşturuldu");
        } catch (IOException e) {
            System.out.println(e + " IO EXCEPTION");
            
        } catch (Exception e) {
            System.out.println("hata kısmı");
            e.printStackTrace();
        }

    }
}
