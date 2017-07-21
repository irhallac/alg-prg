/**
 *
 * @author Ibrahim R Hallac <irhallac at firat.edu.tr>
 */
public class istisna {

    public static void main(String[] args) {
        int a, b, t;
        a = 4;
        b = 0;
        try {
            t = a / b;
            System.out.println("t=" + t);

        } catch (Exception e) {
            System.out.println("hata olustu orjinal hata mesajı asagida");
            System.out.println(e.getMessage());
        }
    }
}
