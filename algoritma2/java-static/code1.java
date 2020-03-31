public class Giris {

    int derece;

    public static void main(String args[]) {
        derece = 5;
    }
}



public class Giris {
    int derece;
    public static void main(String args[]) {
        Giris g1 = new Giris();
        g1.derece = 8;
        System.out.println("Bugün hava " + g1.derece + " derece");
    }
}


public class Giris {
    static int derece;
    public static void main(String args[]) {
        derece = 5;
        System.out.println("Bugün hava " + derece + "derece");
    }
}
