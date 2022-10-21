package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */
        Scanner scan=new Scanner(System.in);
        System.out.print("Ucgenin 1.dik kenarini Giriniz:");
        double a=scan.nextDouble();
        System.out.print("Ucgenin 2.dik kenarini Giriniz:");
        double b=scan.nextDouble();
        System.out.println("birinci kenar= " +a);
        System.out.println("ikinci kenar= " +b);
        double hip=Math.sqrt(a*a + b*b);
        System.out.println("hipotenus = " + hip);



    }
}
