<h2> Text Processing Projesi </h2>

data klasöründe x tane dosya içerisinde y tane kitaba ait isim, yazar ... vb. bilgiler bulunmaktadır.
Bu dosyalarda bulunan kitapları türüne göre ayırarak yeni dosyalara kaydetmeniz isteniyor.
Örneğin türü "Bilim-Mühendislik" olan bütün kitaplar Bilim-Mühendislik.xml dosyasına kaydedilmeli.
Kaç farklı tür olduğunun hesabı programınız tarafından otomatik olarak yapılmalıdır.
Kitaplar kaydedilirken "tarih" niteliğine göre azalan şekilde sıralanmalıdır. Yani tarih değeri en yeni
olan kitap en üstten başlayıp eski kitaplara doğru sıralı bir şekilde olmalıdır.
data klasöründeki kitaplar birden fazla kez yazılı olabilir. Fakat sizin üreteceğiniz türe göre
dosyalarda her kitap sadece 1 kez bulunmalıdır. (İpucu: ISBN değeri kitaplar için ayırt edici bir değerdir)
Not: Proje değerlendirilmesi sırasında size verilen örnek data klasörü yerine içeriği farklı
dosyalardan oluşan yeni bir klasör verilecektir. Programınız yukarıda belirlenen şartları sağladığı taktirde
yeni veriler üzerinde de hatasız olarak çalışabilmelidir.

Katalog yapısı şu şekildedir:


<katalog>

    <kitap>
        <isim></isim>
        <yazar></yazar>
        <tur></tur>
        <yayınevi></yayınevi>
            <detay>
                  <ISBN></ISBN>
                  <tarih></tarih>
            </detay>
    </kitap>
    
</katalog>
