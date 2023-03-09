package j08_ifStatement_TernaryOperator.homeworks;

import java.util.Scanner;

public class Q08 {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç adet aldın?");
        double adet = sc.nextDouble();
        System.out.println("Etikette kaç yazıyor?");
        double fiyat = sc.nextDouble();
        System.out.println("Kredi kartınız varmı?");
        char kart = sc.next().charAt(0);

        double tutar = adet * fiyat;

        System.out.println(kart == 'V' && adet > 10 ? "Ödeyeceğiniz miktar :" + tutar * 0.8 : kart == 'V' &&
                adet < 10 ? "Ödeyeceğiniz miktar :" + tutar * 0.85 : kart == 'Y' && adet > 10 ? "Ödeyeceğiniz miktar :" + tutar * 0.85 :
                kart == 'Y' && adet < 10 ? "Ödeyeceğiniz miktar :" + tutar * 0.9 : "Hatalı giriş");


    }

}
