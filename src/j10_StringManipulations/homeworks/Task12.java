package j10_StringManipulations.homeworks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */

        Scanner sc=new Scanner(System.in);
        System.out.println("3 kelimelik isim giriniz");
        String ad= sc.next().trim();
        String ikinciAd= sc.next().trim();
        String soyad= sc.next().trim();

        System.out.println("Adınız :"+ad+"\nİkinci adınız :"+ikinciAd+"\nSoyadınız :"+soyad);


    }
}
