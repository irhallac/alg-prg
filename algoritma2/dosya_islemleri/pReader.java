
import java.io.File;
import java.util.Scanner;

public class pReader {

    public static void main(String[] args) {
        String yol = "test3.txt";
        File dosya = new File(yol);
        try {
            Scanner giris = new Scanner(dosya);
            while (giris.hasNext()) {
                System.out.println(giris.nextLine());
            }

        } catch (Exception e) {
            System.out.println("hata oluştu");
        }

    }

}
