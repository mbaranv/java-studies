package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {


            Scanner sc=new Scanner(System.in);
            System.out.println("dönüştürmek istediğiniz saniyeyi giriniz");
            int s= sc.nextInt();
            System.out.println("girilen saniye:"+(s/3600)+"saat"+""+(s/60)+"dakika"+s+"saniyedir");


    }
}
