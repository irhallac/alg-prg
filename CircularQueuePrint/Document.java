/**
 *
 * @author ibrahim R. Hallac
 */

//Belge sınıfı
class Document {
    String name;
    int size;
    int pages;
    Person owner;

    Document(String _name, int _size, int _pages, Person _owner) {
        this.name = _name;
        this.size = _size;
        this.pages = _pages;
        this.owner = _owner;
    }

    public String belgeBilgisi() {
        return "Belgenin Adı: " + name + " Boyutu: " + size + " Sayfa Sayısı: " + pages
                + "\t - Dosya Sahibinin  Adı: " + owner.name + " Soyadı: " + owner.surname + " Kullanıcı adı: " + owner.username
                + " E-Posta: " + owner.email;
    }
    
    public int eklemeSuresi(){
        return 4;
    }
}

//kişi sınıfı
class Person {

    String name;
    String surname;
    String username;
    String email;

    Person(String _name, String _surname, String _username, String _email) {
        this.name = _name;
        this.surname = _surname;
        this.username = _username;
        this.email = _email;
    }
}
