package j09_SwitchStatement.homeworks;

import java.util.Scanner;

public class Trip_Project {

    public static void main(String[] args) {

        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz.
 İşlemlerde direkt bunları cağırabilirsiniz.

        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.
      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.



       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.


         */

        Scanner scan = new Scanner(System.in);
        System.out.println("***** ŞakŞak Turizm seyahat şirketimize hos geldiniz *****");
        System.out.println("Frankfurt : 60 km \nKoln : 80\n 20 Km basına 5 euro ucretlendirme yapılır :) ");
        System.out.print("yolculuk yapacagınız sehri seciniz : ");
        String hedef = scan.next().toUpperCase();//sehir buyuk harfe update edildi


        int frankfurtMesafe = 60;
        int kölnMesafe = 80;

        int mesafeTutarFr = (frankfurtMesafe / 20) * 5;
        int mesafeTutarKl = (kölnMesafe / 20) * 5;

        int bakiye = 50;

        double paraUstu;

        switch (hedef) {
            case "FRANKFURT": {
                System.out.println("Rota : FRANKFURT");
                System.out.println("Frankfurt'a tek kişi için bilet fiyatı:" + mesafeTutarFr);
                System.out.println("Kaç kişilik bilet istiyorsunuz? 2 bieltten fazla alamazsınız");
                int biletfr = scan.nextInt();

                switch (biletfr) {
                    case 1:
                        System.out.println("Borcunuz :" + mesafeTutarFr + " euro");
                        System.out.println("Lütfen " + mesafeTutarFr + " euro yu para girişine koyunuz");
                        int ödenecekfr = scan.nextInt();
                        if (ödenecekfr > mesafeTutarFr) {
                            System.out.println("Bilet alma işleminiz onaylandı");
                            System.out.println("Paraüstünüz hazırlanıyor. " + (ödenecekfr - mesafeTutarFr) + " euro para üstünüzü alınız");

                        } else if (ödenecekfr == mesafeTutarFr) {
                            System.out.println("Bilet alma işleminiz onaylandı");
                        } else
                            System.out.println("Bilet alma işleminiz onaylanamadı lütfen " + (15 - ödenecekfr) + " daha yatırınız");
                        break;
                    case 2:
                        System.out.println("Borcunuz :" + mesafeTutarFr * 2);
                        System.out.println("Lütfen " + (mesafeTutarFr * 2) + " euro yu para girişine koyunuz");
                        int ödenecekfr2 = scan.nextInt();
                        if (ödenecekfr2 > mesafeTutarFr * 2) {
                            System.out.println("Bilet alma işleminiz onaylandı");
                            System.out.println("Paraüstünüz hazırlanıyor. " + (ödenecekfr2 - mesafeTutarFr * 2) + " euro para üstünüzü alınız");
                        } else if (ödenecekfr2 == mesafeTutarFr * 2) {
                            System.out.println("Bilet alma işleminiz onaylandı");
                        } else
                            System.out.println("Bilet alma işleminiz onaylanamadı lütfen " + (30 - ödenecekfr2) + " euro daha yatırınız");
                        break;

                    default:
                        System.out.println("2 den fazla bilet alamazsınız");
                }

            }
            break;

            case "KÖLN": {
                System.out.println("Rota : KÖLN");
                System.out.println("Köln'e tek kişi için bilet fiyatı:" + mesafeTutarKl);
                System.out.println("Kaç kişilik bilet istiyorsunuz? 2 bieltten fazla alamazsınız");
                int biletkl = scan.nextInt();
                switch (biletkl) {
                    case 1:
                        System.out.println("Borcunuz :" + mesafeTutarKl + " euro");
                        System.out.println("Lütfen " + mesafeTutarKl + " euro yu para girişine koyunuz");
                        int ödenecekkl = scan.nextInt();
                        if (ödenecekkl > mesafeTutarKl) {
                            System.out.println("Bilet alma işleminiz onaylandı");
                            System.out.println("Paraüstünüz hazırlanıyor. " + (ödenecekkl - mesafeTutarKl) + " euro para üstünüzü alınız");

                        } else if (ödenecekkl == mesafeTutarKl) {
                            System.out.println("Bilet alma işleminiz onaylandı");
                        } else
                            System.out.println("Bilet alma işleminiz onaylanamadı lütfen " + (20 - ödenecekkl) + " daha yatırınız");
                        break;
                    case 2:
                        System.out.println("Borcunuz :" + mesafeTutarKl * 2);
                        System.out.println("Lütfen " + (mesafeTutarKl * 2) + " euro yu para girişine koyunuz");
                        int ödenecekkl2 = scan.nextInt();
                        if (ödenecekkl2 > mesafeTutarKl * 2) {
                            System.out.println("Bilet alma işleminiz onaylandı");
                            System.out.println("Paraüstünüz hazırlanıyor. " + (ödenecekkl2 - mesafeTutarKl * 2) + " euro para üstünüzü alınız");
                        } else if (ödenecekkl2 == mesafeTutarKl * 2) {
                            System.out.println("Bilet alma işleminiz onaylandı");
                        } else
                            System.out.println("Bilet alma işleminiz onaylanamadı lütfen " + (40 - ödenecekkl2) + " euro daha yatırınız");
                        break;

                    default:
                        System.out.println("2 den fazla bilet alamazsınız");
                }

            }
            break;
            default:
                System.out.println("Oraya seferimiz yoktur");

        }


    }
}
