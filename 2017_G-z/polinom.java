package algoritma1;

import java.util.Scanner;

/**
 *
 * @author Ibrahim R Hallac <irhallac at firat.edu.tr>
 *
 * Klavyeden girilen b ve c değerleri için x*x + b*x + c denkleminin köklerini bulan program
 * Denklemin 2 tane reel kökünün olduğu varsayılmıştır
 *
 * örnek çalışma: 
 *
 * b değerini giriniz
 * -1
 * c değerini giriniz
 * -6
 * 1. kök = 3.0
 * 2. kök = -2.0
 */
public class polinom {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("b değerini giriniz");
        double b = klavye.nextDouble();
        System.out.println("c değerini giriniz");
        double c = klavye.nextDouble();

        double diskriminant = b * b - 4.0 * c;
        double karekok_diskriminant = Math.sqrt(diskriminant);

        double kok1 = (-b + karekok_diskriminant) / 2.0;
        double kok2 = (-b - karekok_diskriminant) / 2.0;

        System.out.println("1. kök = " + kok1);
        System.out.println("2. kök = " + kok2);
    }
}
