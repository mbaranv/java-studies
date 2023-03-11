package j09_SwitchStatement.homeworks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir ay giriniz");
        String ay = sc.nextLine().toLowerCase();


        switch (ay) {

            case "ocak":
            case "mart":
            case "mayıs":
            case "temmuz":
            case "ağustos":
            case "ekim":
            case "aralık":
                System.out.println("Bu ay 31 çeker");
                break;

            case "nisan":
            case "haziran":
            case "eylül":
            case "kasım":
                System.out.println("Bu ay 30 çeker");
                break;
            case "şubat":
                System.out.println("Bu ay 28 veya 29 çeker");
                break;
            default:
                System.out.println("Yanlış giriş yaptın");
        }


    }

}
