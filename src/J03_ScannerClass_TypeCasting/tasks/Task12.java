package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Clarusway Spor Salonu Üyelik Formu (Sadece aylık 20$)");
        System.out.println("İsim Soyisim :");
        String ad=sc.nextLine();
        System.out.println("Kaç yaşındasınız? :");
        int yas=sc.nextInt();
        System.out.println("Kaç kilosunuz? :");
        int kilo=sc.nextInt();
        System.out.println("Kaç aylık üyelik düşünüyorsunuz? :");
        int ay=sc.nextInt();
        System.out.println("Üye Bilgileri :"+"\nAdı Soyadı :"+ad+"\nYaşı : "+yas+"\nKilosu :"+kilo+"\nÜyelik süresi :"+ay+"\nToplam borcunuz :"+ay*20+"$");

    }
}
