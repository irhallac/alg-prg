import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class ornek3 {
    public static void main(String[] args) throws IOException {
        File dosya=new File("deneme.txt");
        PrintWriter p=null;
        if(!dosya.exists()){
            dosya.createNewFile();
            System.out.println("Dosya oluşturuldu");
        }
        else{
           //p=new PrintWriter(dosya);
            p=new PrintWriter(new FileOutputStream(dosya, false));
            Scanner klavye=new Scanner(System.in);
            System.out.println("Ad Soyad ve Notunuzu girin");
            String ad=klavye.nextLine();
            String soyad=klavye.nextLine();
            int not=klavye.nextInt();
            p.print(ad+" ");
            p.print(soyad+" ");
            p.println(not);            
            p.close();
        }
        
    }    
}
