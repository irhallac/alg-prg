
import java.io.File;
import java.util.Scanner;


public class dosyaOlustur {
    
    public void olustur(String klasor_adi){
        Scanner klavye = new Scanner(System.in);
        System.out.println("dosya ismini giriniz");
        String dosya_adi = klavye.next();
        System.out.println(klasor_adi+dosya_adi+".txt");
        try {
             File dosya = new File(klasor_adi+dosya_adi+".txt");
             dosya.createNewFile();
             //System.out.println("dosya olusturma basarili");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("dosya olusturma hatasi");
        }
        ///home/student/NetBeansProjects/BMU112/dosya_2018
    }
    
    public void listele(String klasor_adi, String k){
        File klasor = new File(klasor_adi);
        File[] dosyalar = klasor.listFiles();
        System.out.println(k + " ile başlayan dosyalar:");
        for (int i = 0; i < dosyalar.length; i++) {
            String isim = dosyalar[i].getName();
            if(isim.startsWith(k)){
                System.out.println(isim);
            }
        }
        
    }
    
    public static void main(String[] args) {
        dosyaOlustur rf1 = new dosyaOlustur();
        
        System.out.println("kaç tane dosya olusturulsun ?");
        Scanner klavye = new Scanner(System.in);
        int file_num = klavye.nextInt();
        String file_name="";
        for (int i = 0; i < file_num; i++) {
            rf1.olustur("folder1/");
        }
        
        rf1.listele("folder1/","a");
        rf1.listele("folder1/","c");
        rf1.listele("folder1/","b");
        
    }
    
}
