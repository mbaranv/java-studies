package J04_AritmeticOperators;

import java.util.Scanner;

public class C02_IncrementDecrement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir sayı giriniz");
        int sayi = sc.nextInt();

        // 1 ler basamgı-> bir sayının 10 bolumunden kalan 1 ler basmagıdır..
        int birler = sayi % 10;//sayının birler basamagı
        sayi /= 10;// sayı 10 bolumunden bolumu verir 853/10->85
        int onlar = sayi % 10;// 85in 10 bolumunden kalan->5
        int yüzler = sayi / 10;// 85'in 10' a bolumu ->8

        System.out.println("Girdiginiz sayinin birler basamagi :" + birler + "\nGirdiginiz sayinin onlar basamagi : " + onlar
                + "\nGirdiginiz sayinin yuzler basamagi :" + yüzler);
    }
}