package j09_SwitchStatement.homeworks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
// 2- Girilen 3 basamaklı sayıyı kelime olarak print eden code create ediniz..


        Scanner scan = new Scanner(System.in);
        System.out.print("sayi giriniz :");
        int sayi = scan.nextInt();

        int birler = sayi % 10;
        int onlar = (sayi / 10) % 10;
        int yüzler = sayi / 100;

        switch (yüzler) {
            case 1:
                System.out.print("Yüz");
                break;
            case 2:
                System.out.print("İkiyüz");
                break;
            case 3:
                System.out.print("Üçyüz");
                break;
            case 4:
                System.out.print("Dörtyüz");
                break;
            case 5:
                System.out.print("Beşyüz");
                break;
            case 6:
                System.out.print("Altıyüz");
                break;
            case 7:
                System.out.print("Yediyüz");
                break;
            case 8:
                System.out.print("Sekizyüz");
                break;
            case 9:
                System.out.print("Dokuzyüz");
                break;
        }
        switch (onlar) {
            case 1:
                System.out.print("On");
                break;
            case 2:
                System.out.print("Yirmi");
                break;
            case 3:
                System.out.print("Otuz");
                break;
            case 4:
                System.out.print("Kırk");
                break;
            case 5:
                System.out.print("Elli");
                break;
            case 6:
                System.out.print("Altmış");
                break;
            case 7:
                System.out.print("Yetmiş");
                break;
            case 8:
                System.out.print("Seksen");
                break;
            case 9:
                System.out.print("Doksan");
                break;

        }
        switch (birler) {
            case 1:
                System.out.print("Bir");
                break;
            case 2:
                System.out.print("İki");
                break;
            case 3:
                System.out.print("Üç");
                break;
            case 4:
                System.out.print("Dört");
                break;
            case 5:
                System.out.print("Beş");
                break;
            case 6:
                System.out.print("Altı");
                break;
            case 7:
                System.out.print("Yedi");
                break;
            case 8:
                System.out.print("Sekiz");
                break;
            case 9:
                System.out.print("Dokuz");
                break;

        }


    }
}
