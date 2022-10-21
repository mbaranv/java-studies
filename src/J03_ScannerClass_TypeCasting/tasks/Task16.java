package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Not Hesaplama Bolumune Hosgeldiniz");
        System.out.println("Lutfen Vize1 notunuzu giriniz:");
        int vize1=scan.nextInt();
        System.out.println("Lutfen Vize2 notunuzu giriniz:");
        int vize2=scan.nextInt();
        System.out.println("Lutfen Final notunuzu giriniz:");
        int finalNotu=scan.nextInt();
        double gecisNotu=((vize1+vize2)/2)*0.30+finalNotu*0.70;
        System.out.println("gecisNotu = " + gecisNotu);



    }
}
