package j11_MethodCreation.homeworks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */
        Scanner sc=new Scanner(System.in);
        System.out.println("Saat değeri giriniz");
        double saat=sc.nextDouble();

        System.out.println(hesaplama(saat));


    }

    private static double hesaplama(double a) {
       double sonuc=a*3600;
        return sonuc;
    }
}
