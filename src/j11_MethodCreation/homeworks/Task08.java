package j11_MethodCreation.homeworks;

import java.time.LocalDate;
import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */

        Scanner sc=new Scanner(System.in);

        System.out.println("Lütfen bir yıl giriniz");
        int yil=sc.nextInt();

        System.out.println(artikYil(yil));

    }

    private static String artikYil(int yil) {
        String sonuc;
        if ((yil%4==0&&yil%100!=0)||yil%400==0){
            sonuc="Artık yıl";
        }else sonuc="Artık yıl değil";

        return sonuc;
    }
}
