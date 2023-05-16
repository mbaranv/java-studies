package j12_Loops.L01_ForLoop.homeworks;

import java.util.Scanner;

public class Odev05 {

    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Bir sayı girin");
        int sayı=sc.nextInt();


        System.out.println(powerOfThree(sayı)?"girdğiniz sayı 3 ün üssüdür":"girdiğiniz sayı 3 ün üssü değildir");


    }

    private static boolean powerOfThree(int num) {
        boolean flag=true;

        for (int i=3; i<=num; i*=3) {
            if (num%i !=0) flag = false;
        }
        return flag;
    }
}
