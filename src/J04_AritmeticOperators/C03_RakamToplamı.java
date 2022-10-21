package J04_AritmeticOperators;

import java.util.Scanner;

public class C03_RakamToplamı {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir sayı giriniz");
        int sayi=sc.nextInt();
        int birler=sayi%10;//Birler basamağı
        int yüzler= sayi/100;
        int onlar=sayi%100;//Onlar basamağı
        onlar /=10;//Onlar basamağı
        System.out.println("Toplam :"+(birler+onlar+yüzler));







    }
}
