package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Vucut Kitle Endeksi Ölçümü");
        System.out.println("Lütfen boyunuzu cm cinsinden giriniz");
        float boy=sc.nextFloat();
        System.out.println("Lütfen kilonuzu kg cinsinden giriniz");
        int kilo=sc.nextInt();
         float vki= kilo/(boy*boy/10000);

        System.out.println("VKİ'niz :" + vki);
        System.out.println("VKİ'niz : " + (int)vki);




    }
}
