-/**
- *
- * @author Ibrahim R Hallac <irhallac at firat.edu.tr>
- */

public class merhaba {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Merhaba kullanici");
        } else if (args.length == 1) {
            System.out.println("Merhaba " + args[0]);
        } else if (args.length == 2) {
            System.out.println("Merhaba " + args[0] + " ve " + args[1]);
        }
        else{
            System.out.println("2'den fazla kullanici girilemez");
        }
    }
}
