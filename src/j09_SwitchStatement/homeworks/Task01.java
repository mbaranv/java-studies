package j09_SwitchStatement.homeworks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi = sc.nextInt();

        sayi/=10;//İnt tipinde olduğu için bölüm sonucunda birler basamağını atıp yeni haliyle yazdıracaktır.
        int onlarBasamagı=sayi%10;//sayının 10a bölümünden kalan onlar basamağını yani yeni birler basamağını verir.

        switch (onlarBasamagı){
            case 0:
                System.out.println("Sayının onlar basamağı sıfır");
                break;
            case 1:
                System.out.println("Sayının onlar basamağı bir");
                break;
            case 2:
                System.out.println("Sayının onlar basamağı iki");
                break;
            case 3:
                System.out.println("Sayının onlar basamağı üç");
                break;
            case 4:
                System.out.println("Sayının onlar basamağı dört");
                break;
            case 5:
                System.out.println("Sayının onlar basamağı beş");
                break;
            case 6:
                System.out.println("Sayının onlar basamağı altı");
                break;
            case 7:
                System.out.println("Sayının onlar basamağı yedi");
                break;
            case 8:
                System.out.println("Sayının onlar basamağı sekiz");
                break;
            case 9:
                System.out.println("Sayının onlar basamağı dokuz");
                break;
            default:
                System.out.println("yeniden giriş yapınız");
        }



    }
}
