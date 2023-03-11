package j09_SwitchStatement.homeworks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
        // pazartesi hafta başlangıcı olarak alınız
        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın kaçıncı gününde olduğunu giriniz : ");
        int kacıncıGun = scan.nextInt();

        switch (kacıncıGun){

            case 1:
                System.out.println("100 gün sonrası çarşamba");
                break;
            case 2:
                System.out.println("100 gün sonrası perşembe");
                break;
            case 3:
                System.out.println("100 gün sonrası cuma");
                break;
            case 4:
                System.out.println("100 gün sonrası cumartesi");
                break;
            case 5:
                System.out.println("100 gün sonrası pazar");
                break;
            case 6:
                System.out.println("100 gün sonrası pazartesi");
                break;
            case 7:
                System.out.println("100 gün sonrası salı");
                break;
            default:
                System.out.println("Yeniden giriş yapınız");



        }





    }
}

