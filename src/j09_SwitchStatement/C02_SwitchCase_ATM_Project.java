package j09_SwitchStatement;

import java.util.Scanner;

public class C02_SwitchCase_ATM_Project {
    public static void main(String[] args) {

        //TASK: Bakiye (başlangıç bakiyesi 1000 tl) öğrenme,para yatırma ve çekme,
        // çıkış işlemlerinin yapıldığı bir ATM app. code create ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("*** ÇİFTLİK BANKA HOŞGELDİNİZ.SENİN PARAN BENİM PARAM ***");
        System.out.println("Yapmak istediğiniz işlem aşağıdakilerden hangisidir \n1.Bakiye öğrenme\n2.Para yatırma\n3.Para çekme\n4.Çıkış");
        int bakiye = 1000;
        int seçim = sc.nextInt();

        switch (seçim) {
            case 1:
                System.out.println("Bakiyeniz : " + bakiye);
                break;
            case 2:
                System.out.println("Yatırmak istediğiniz miktarı giriniz :");
                int yatırma = sc.nextInt();
                System.out.println("Yeni bakiyeniz :" + (bakiye + yatırma));//bakiye+=yatırma; yapabilrdik
                break;
            case 3:
                System.out.println("Çekmek istediğiniz miktarı giriniz");
                int çekme = sc.nextInt();
                if (bakiye > çekme)
                    System.out.println(çekme + " tl çekme isteğiniz gerçekleştirildi.\nYeni bakiyeniz :" + (bakiye - çekme)+"tl");
                else if (çekme > bakiye)
                    System.out.println("Birader zaten 1000 tl para var fazlasını veremem ama kredi verebilirim istersen");
                else System.out.println("Hayırlı olsun sıfırlandın");
                break;
            case 4:
                System.out.println("Yine bekleriz");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız");

        }


    }
}
