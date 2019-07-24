/**
 *
 * @author ibrahim R. Hallac
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

//Dizi kullanarak dairesel kuyruk modellenmesi
class daireselKuyruk {

    private int currentSize; //anlık belge sayısı
    private Document[] Elements;

    private int maxSize; //maksimum belge sayısı

    private int rear;//son
    private int front; //baş 
    private int eklemeSuresi = 2; //ödev varsayılan = 4
    private double yazmaHizi = 100.0; // ödev varsayılan hız

    public daireselKuyruk(int maxSize) {
        this.maxSize = maxSize;
        Elements = new Document[this.maxSize];
        currentSize = 0;
        front = -1;
        rear = -1;
    }

    public static void gecikme(int sn) {
        try {
            // System.out.println(sn + " sn bekletiliyor");
            TimeUnit.SECONDS.sleep(sn);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
    }

    // yazdırma süresini sayfa sayısı ve hız ile hesapla
    public int yazmaSuresi(int sayfaSayisi) {
        double sure = sayfaSayisi * 60 / yazmaHizi;
        return (int) (sure + 0.5);
    }

    public void ekle(Document doc) {
        if (doluMu()) {
            System.out.println("Yazıcı kuyruğu doldu");
        } else {
            System.out.println(doc.name + " (" + doc.pages + ") adet sayfa Kuyruğa ekleniyor \n");
            rear = (rear + 1) % Elements.length;
            Elements[rear] = doc;
            currentSize++;

            if (front == -1) {
                front = rear;
            }
            gecikme(eklemeSuresi);
        }

    }

    public Document cikar() {
        Document doc;
        if (bosMu()) {
            System.out.println("Kuyruk Boş!");
            return null;
        } else {
            doc = Elements[front];
            Elements[front] = null;
            front = (front + 1) % Elements.length;
            currentSize--;
            gecikme(yazmaSuresi(doc.pages));
            return doc;
        }

    }

    public boolean doluMu() {
        return (currentSize == Elements.length);
    }

    public boolean bosMu() {
        return (currentSize == 0);
    }

    // kuyrukta bulunan bütün elemanları baştan sona doğru göster
    public void elemanGoster() {
        int elements = currentSize;
        int i = front;
        System.out.print("Kuyruktaki Belgeler: ");
        while (elements > 0) {
            if (i == maxSize) {
                i = 0;
            }
            System.out.print(Elements[i].name + " ");
            i++;
            elements--;
        }
        System.out.println("\n");
    }

    public void quiz_question(int quantum) {
        Document doc;
        Document d_tmp = null;
        Person p_tmp = null;
        while (!bosMu()) {
            doc = cikar();
            if (doc.pages > quantum) {
                p_tmp = new Person(doc.owner.name, doc.owner.surname, doc.owner.username, doc.owner.email);
                d_tmp = new Document(doc.name, doc.size, doc.pages - quantum, p_tmp);
                System.out.println(doc.name + "->" + doc.pages + " sayfanın " + quantum + " adedi yazdırıldı."
                        + " Kalan " + (doc.pages - quantum) + " sayfa kuyruğa ekleniyor");
                ekle(d_tmp);

            } else {
                System.out.println(doc.name + " için yazdırma işlemi tamamlandı");
            }
            elemanGoster();
        }
        //yazdırılacak belge kalmadığını göster
        cikar();
    }
}

public class CircularQueuePrint {

    static void dosyadanEkle(File file, daireselKuyruk k) throws IOException, InterruptedException {
        if (!file.exists()) {
            System.out.println("Dosya Yok");
        } else {
            Person kisi;
            Document belge;
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String satir;
            while ((satir = br.readLine()) != null) {
                // bilgiler - ile bölünecek
                String[] temp = satir.split("-");
                kisi = new Person(temp[3], temp[4], temp[5], temp[6]);
                //satirdan elde edilen bilgilerle yeni bir Belge nesnesi oluştur
                belge = new Document(temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), kisi);
                //belgeyi kuyruğa ekle
                k.ekle(belge);
            }
        }
    }

    public static void main(String[] args) {
        // max 5 elamanlı dairesel kuyruk oluştur
        daireselKuyruk dk = new daireselKuyruk(5);
        File file = new File("dosya.txt");
        try {
            System.out.println("BELGELER YAZICI KUYRUĞUNA ALINIYOR \n");
            dosyadanEkle(file, dk);
        } catch (IOException ex) {
            Logger.getLogger(CircularQueuePrint.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(CircularQueuePrint.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("\n YAZDIRMA İŞLEMİ BAŞLADI \n");
        
        //quiz sorusu
        dk.quiz_question(3);
    }

}