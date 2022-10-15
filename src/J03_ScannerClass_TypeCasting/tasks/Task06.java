package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("ondalık değerlerini görmek istediğiniz sayıyı giriniz");
        int sayı=sc.nextInt();
        int a=sayı/100;
        int b=(sayı/10)%10;
        int c=sayı%10;
        System.out.println("girilen sayının birler basaamağı :"+c);
        System.out.println("girilen sayının onlar basamağı :"+b);
        System.out.println("girilen sayının yuzler basamağı :"+a);




    }
}
