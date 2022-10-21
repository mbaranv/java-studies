package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */
        Scanner scan=new Scanner(System.in);
        System.out.print("Gideceginiz Mesafeyi (km) Giriniz:");
        double km=scan.nextDouble();
        System.out.print("Hizinizi (km) Giriniz:");
        double hiz=scan.nextDouble();
        System.out.println("Varis zamaniniz = " + (km/hiz) +" saattir");


    }
}
