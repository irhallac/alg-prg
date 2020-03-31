//Adım-1
public class Musteri {
    String isim;
    int yas;
    int m_no;
    double yuzde_indirim;
    
    public void bilgileriYazdir(){
            //....
    }  
}

//Adım-2
public class Musteri {

    String isim;
    int yas;
    int m_no;
    double yuzde_indirim;

    public void bilgileriYazdir() {
        System.out.println("Müşteri adı " + isim + " yaşı " + yas + " ve "
                + "müşteri no = " + m_no + "indirim yüzdesi = " + yuzde_indirim);
    }

    public static void main(String[] args) {
        Musteri m1 = new Musteri();
        m1.isim = "ali";
        m1.yas = 24;
        m1.m_no = 1;
        m1.yuzde_indirim = 12.5;
        m1.bilgileriYazdir();
        
        Musteri m2 = new Musteri();
        m2.isim = "gamze";
        m2.yas = 22;
        m2.m_no = 2;
        m2.yuzde_indirim = 12.5;
        m2.bilgileriYazdir();
        
    }

}


//Adım-3



//Adım-4
