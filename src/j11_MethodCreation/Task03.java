package j11_MethodCreation;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1.sayıyı giriniz");
        double sayı1 = sc.nextDouble();

        System.out.println("2.sayıyı giriniz");
        double sayı2 = sc.nextDouble();

        System.out.println("Hangi işlemi yapmak istiyorsunuz \n1.Toplama \n2.Çıkarma \n3.Çarpma \n4.Bölme");
        int seçim = sc.nextInt();

        if (seçim == 1)
            System.out.println(toplamaMethod(sayı1, sayı2));
        else if (seçim == 2)
            System.out.println(çıkarmaMethod(sayı1, sayı2));
        else if (seçim == 3)
            System.out.println(çarpmaMethod(sayı1, sayı2));
        else if (seçim == 4)
            System.out.println(bölmeMethod(sayı1, sayı2));
        else System.out.println("Yanlış giriş yaptınız");


    }

    private static double bölmeMethod(double sayı1, double sayı2) {

        double bölüm = sayı1 / sayı2;

        return bölüm;
    }

    private static double çarpmaMethod(double sayı1, double sayı2) {
        double çarpım = sayı1 * sayı2;

        return çarpım;
    }

    private static double çıkarmaMethod(double sayı1, double sayı2) {
        double çıkarma = sayı1 - sayı2;

        return çıkarma;
    }

    private static double toplamaMethod(double sayı1, double sayı2) {
        double toplam = sayı1 + sayı2;

        return toplam;
    }
}
