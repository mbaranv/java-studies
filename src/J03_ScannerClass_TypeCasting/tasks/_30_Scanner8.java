package J03_ScannerClass_TypeCasting.homeworks.ScannerTasks;

import java.util.Scanner;

public class _30_Scanner8 {

    public static void main(String[] args) {

    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */

Scanner sc=new Scanner(System.in);
        System.out.println("Ağırlık giriniz (kg) cinsinden");
        byte kg=sc.nextByte();
        System.out.println("kg = " + kg);


    }
}
