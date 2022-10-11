package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task05 {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {


            Scanner sc=new Scanner(System.in);
            System.out.println("lütfen saniyeye çevirmek istediğiniz saati giriniz :");
            double saat= sc.nextDouble();
            System.out.println("girdiğiniz saat değeri"+saat*3600+"saniye yapar");

    }

}
