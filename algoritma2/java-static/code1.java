//Adım-1


//Adım-2


//Adım-3
public class Giris {

    int derece;

    public static void main(String args[]) {
        derece = 5;
    }
}

//Adım-4
public class Giris {
    int derece;
    public static void main(String args[]) {
        Giris g1 = new Giris();
        g1.derece = 8;
        System.out.println("Bugün hava " + g1.derece + " derece");
    }
}

//Adım-5
public class Giris {
    static int derece;
    public static void main(String args[]) {
        derece = 5;
        System.out.println("Bugün hava " + derece + "derece");
    }
}


//Adım-6
public class Giris {

    public void selamGonder(String isim) {
        System.out.println("Selam " + isim);
    }

    public static void main(String args[]) {
        selamGonder("Ali");
    }
}

//Adım-7
public class Giris {

    public void selamGonder(String isim) {
        System.out.println("Selam " + isim);
    }

    public static void main(String args[]) {
        Giris g2 = new Giris();
        g2.selamGonder("Ali");
    }
}

//Adım-8
public class Giris {

    public static void selamGonder(String isim) {
        System.out.println("Selam " + isim);
    }

    public static void main(String args[]) {
        selamGonder("Gamze");
    }
}

