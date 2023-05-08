package j10_StringManipulations.homeworks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
             /* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
         */


        Scanner sc = new Scanner(System.in);

        System.out.print("1 adınızı giriniz : ");
        String ilkAd = sc.nextLine();

        System.out.print("2 adınızı giriniz : ");
        String ikinciAd = sc.nextLine();

        System.out.println(ilkAd.toUpperCase().charAt(0) +ilkAd.substring(1) +" "+
                ikinciAd.toUpperCase().charAt(0)+ikinciAd.substring(1));


    }
}
