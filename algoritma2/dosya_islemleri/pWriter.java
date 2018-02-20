import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class pWriter {
    public static void main(String[] args) {
        PrintWriter pr;
        File dosya = new File("test3.txt");
        Scanner klavye = new Scanner(System.in);
        try {
            pr = new PrintWriter(dosya);
            System.out.println("isim giriniz");
            pr.print("isim: ");
            String isim = klavye.nextLine();
            pr.print(isim + "\n");
            System.out.println("numarası ?");
            pr.print("no: ");
            int no = klavye.nextInt();
            pr.print(no);
            
            pr.close();

        } catch (Exception e) {
            System.out.println("hata oluştu");
        }
    }
}
